import java.util.Date;
import java.text.SimpleDateFormat;

public class CurrentDateTime {

	public static void main(String[] args) {

		Date currentDate = new Date();
		SimpleDateFormat dateToString = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

		System.out.println(dateToString.format(currentDate));

		r3
	}

}
