package check;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTester {

	
		public static void main(String[] args) throws ParseException {
			SimpleDateFormat tf = new SimpleDateFormat("hh:mm:ss");
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss");
			Calendar c = Calendar.getInstance();
			c.setTime(tf.parse("20:19:18"));

			System.out.println (df.format (tf.parse("20:19:18")));
			
		}
}
