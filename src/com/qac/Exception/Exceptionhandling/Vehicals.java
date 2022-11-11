package com.qac.Exception.Exceptionhandling;

public class Vehicals {
	
	public static void main(String[] args) {
		String [] names = {"BUS","CAR","BIKE","BICYCLE","TRUCK","AUTO RICKSHAW","TRACTOR"};
		System.out.println("Started main()");
		
			for( int i = 0; i<= names.length; i++) {
				try {
					System.out.println(names[i]);
				} catch (ArrayIndexOutOfBoundsException|NullPointerException e) {
					
					e.printStackTrace();
				}
			}
			System.out.println("End of main()");	
		}
}
	


