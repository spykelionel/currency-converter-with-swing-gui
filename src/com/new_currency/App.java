package com.new_currency;

public class App {

	public static void main(String[] args) {
//		System.out.print(false);
		String[] from = {"USD", "FCFA", "UERO", "POUND"};
		String[] to = {"USD", "FCFA", "UERO", "POUND"};
		double amount = 0.0;
		double value = 0.0;
		int down = to.length-1;
		
		new Gui();
//		for(int i=0; i<to.length; i++) {
//			System.out.println(from[i]+ " to " + to[down]);
//			down--;			
//		}
		/*
		 * prompt amount..
		 * 
		 * From FCFA -> USD : Amount * 0.0018
		 * From USD -> FCFA : Amount * 550.21
		 * 
		 * From FCFA -> EURO : Amount * 0.0015
		 * From UERO -> FCA : Amount * 654.36
		 * 
		 * From FCFA -> POUND : Amount * 0.0013
		 * From POUND -> FCFA : Amount * 761.54
		 * 
		 * From USD -> EURO: Amount * 0.84
		 * From UERO -> USD: Amount * 1.19
		 * 
		 * From USD -> POUND: Amount * 0.72
		 * From POUND -> USD: Amount * 1.39
		 * 
		 * From EUR -> POUND: Amount * 0.86
		 * From POUND -> UER: Amount * 1.16
		 * 
		 * When Done.
		 * new TODO:
		 * 			- add background Imageicon
		 * 			- add icons if tool menu icon
		 * 			- add other icons to combo list.
		 * 			- do others. Ofcourse if neccessary
		 * 
		 */
		 
//		
//		
//		for(String x: from) {
//			System.out.println(x);
//		}

	}

}
