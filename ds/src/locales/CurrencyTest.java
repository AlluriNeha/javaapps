package Locales;

import java.util.*;


import java.text.*;

public class CurrencyTest {
    
    public static void main(String[] args) {
    	double amounts = 123456.12;
    	
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(amounts));
        System.out.println("China" + NumberFormat.getCurrencyInstance(Locale.CHINA).format(amounts));
        System.out.println("France" + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amounts));
    
        System.out.println("India: " + NumberFormat.getCurrencyInstance(Locale.US).format(amounts).replace("$","₹"));
    }
}