package com.capjemini.coetajava;



	import java.time.LocalDate;
	import java.time.Month;

	public class DataDemo1 {

		public static void main(String[] args) {
	    LocalDate date=LocalDate.now();
	    System.out.println(date);
	    
	  LocalDate datenew=LocalDate.of(2013, Month.AUGUST, 5);
	  System.out.println("new date:"+datenew);
	    
	    LocalDate yesterday=date.minusDays(1);
	    System.out.println(yesterday);
	    
	    LocalDate tomorrow=date.plusDays(1);
	    System.out.println(tomorrow);


	}

}
