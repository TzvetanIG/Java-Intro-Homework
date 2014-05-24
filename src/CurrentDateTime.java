import java.util.Date;
import java.text.SimpleDateFormat;

public class CurrentDateTime {

	public static void main(String[] args) {

		Date currentDate = new Date();
		SimpleDateFormat dateToString = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

		System.out.println(dateToString.format(currentDate));
		System.out.printf("%tF - %<tT new row2", currentDate);
		klgdjlfgjdj
		new row
		System.out.printf("%tF - %<tT", currentDate);
		
	}

}
