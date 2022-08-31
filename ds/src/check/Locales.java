package check;

import java.util.Locale;
import java.lang.Math;


public class Locales {
	public static void main(String[] args ) {
		Locale[] ls = Locale.getAvailableLocales();
		for (Locale l:ls) {
			System.out.println(l.getCountry()+":"+l.getDisplayLanguage()+":"+l.getLanguage()+":"+l);
		}
	}
}
