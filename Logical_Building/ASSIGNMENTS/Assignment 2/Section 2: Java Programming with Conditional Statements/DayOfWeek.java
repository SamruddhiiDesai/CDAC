/*Question 2: Days of the Week 
Write a program that uses a nested switch statement to print out the day of the 
week based on an integer input (1 for Monday, 2 for Tuesday, etc.).
 Additionally, within each day, print whether it is a weekday or weekend. */
 
 public class DayOfWeek{
      public static void main(String[] args){
	  int day=2;
	  switch(day){
	     case 1:
		 System.out.println("Monday");
		 switch(day){
			 case 1:
			 case 2:
			 case 3:
			 case 4:
			 case 5:
			 System.out.println("WEEKDAY");
			 break;
			 case 6:
			 case 7:
			 System.out.println("WEEKEND");
			 break;
		 }
		 break;
		 
		 case 2:
		 System.out.println("Tuesday");
		  switch(day){
			 case 1:
			 case 2:
			 case 3:
			 case 4:
			 case 5:
			 System.out.println("WEEKDAY");
			 break;
			 case 6:
			 case 7:
			 System.out.println("WEEKEND");
			 break;
		 }
		 break;
		 
		 case 3:
		 System.out.println("Wensday");
		  switch(day){
			 case 1:
			 case 2:
			 case 3:
			 case 4:
			 case 5:
			 System.out.println("WEEKDAY");
			 break;
			 case 6:
			 case 7:
			 System.out.println("WEEKEND");
			 break;
		 }
		 break;
		 
		 case 4:
		 System.out.println("Thuesday");
		  switch(day){
			 case 1:
			 case 2:
			 case 3:
			 case 4:
			 case 5:
			 System.out.println("WEEKDAY");
			 break;
			 case 6:
			 case 7:
			 System.out.println("WEEKEND");
			 break;
		 }
		 break;
		 
		 case 5:
		 System.out.println("Friday");
		  switch(day){
			 case 1:
			 case 2:
			 case 3:
			 case 4:
			 case 5:
			 System.out.println("WEEKDAY");
			 break;
			 case 6:
			 case 7:
			 System.out.println("WEEKEND");
			 break;
		 }
		 break;
		 
		 case 6:
		 System.out.println("Saturday");
		  switch(day){
			 case 1:
			 case 2:
			 case 3:
			 case 4:
			 case 5:
			 System.out.println("WEEKDAY");
			 break;
			 case 6:
			 case 7:
			 System.out.println("WEEKEND");
			 break;
		 }
		 break;
		 
		 case 7:
		 System.out.println("Sunday weekend");
		  switch(day){
			 case 1:
			 case 2:
			 case 3:
			 case 4:
			 case 5:
			 System.out.println("WEEKDAY");
			 break;
			 case 6:
			 case 7:
			 System.out.println("WEEKEND");
			 break;
		 }
		 break;
		 
	  }
	  
	  }
 }