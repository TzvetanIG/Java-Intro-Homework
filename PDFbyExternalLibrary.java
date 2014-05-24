import java.io.FileOutputStream;
import java.io.IOException;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;

import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFbyExternalLibrary {
	
	public static void main(String[] args) throws DocumentException, IOException {
		
		char[] suits = {'\u2663', '\u2666', '\u2665', '\u2660' };
		
		String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		
		
		Document file = new Document(PageSize.A4, 50, 50, 50, 50);
		
		PdfWriter writer = PdfWriter.getInstance(file, 

				new FileOutputStream("Cards.pdf"));
		
		file.open();
		

		
		
		for (int i = 0; i < faces.length; i++) {
			
			PdfPTable row = new PdfPTable(7);	
		
			row.setSpacingAfter(10f);
		
			row.setSpacingBefore(10f);
			
			float[] widthPercentage = {15, 6.5f , 15, 6.25f, 15, 6.25f, 15};
			
			row.setWidths(widthPercentage);
			
			for (int j = 0; j < suits.length - 1; j++) {
				
				row.addCell(card(faces[i], suits[j]));
				row.addCell(emptyCell(5));
				
			}
			
			row.addCell(card(faces[i], suits[3]));
			
			file.add(row);
		}

		
		file.close();		
	}

	public static PdfPCell card(String face, char suit) throws DocumentException, IOException {
	
		PdfPTable card = new PdfPTable(1);
        BaseFont baseFont = BaseFont.createFont("C:/Windows/Fonts/Arial.ttf", BaseFont.IDENTITY_H, true);
        
		Font font;
		
		if (suit == '\u2666' || suit == '\u2665' ) {
			
			font = new Font(baseFont, 18, Font.NORMAL, BaseColor.RED);
			
		} else {
			
			font = new Font(baseFont, 18, Font.NORMAL, BaseColor.BLACK);
			
		}
		
		PdfPCell cell = new PdfPCell(new Phrase(face + suit, font));
		
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		
		cell.setPadding(20f);
		cell.setPaddingBottom(42f);
		cell.setPaddingTop(42f);
		
		card.addCell(cell);
		
		return cell;
		
	}
	
	public static PdfPCell emptyCell(float pading) throws DocumentException, IOException {
		
 		PdfPCell cell = new PdfPCell(new Phrase(" "));
		
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		
		cell.setPadding(pading);
		
		cell.setBorder(0);
	
		return cell;
		
	}
	

	
	
}
