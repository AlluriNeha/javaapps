package check;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class GeneratePerson {
	
	public static void main (String[] args) throws ParseException {
		SimpleDateFormat d = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat d1 = new SimpleDateFormat("dd-MMM-yyyy");
		Date dt = d.parse("12/15/1998");
		String s1 = d1.format(dt);
		System.out.println(s1);
	}

}
