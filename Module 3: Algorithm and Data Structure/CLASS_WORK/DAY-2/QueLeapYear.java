import java.util.Scanner;
class QueLeapYear{
  
  static boolean leapYear(int year){
  
     if(((year%4==0)&&(year%100!=0))||(year%400==0)){
	   return true;
	 }
	 return false;
  }
  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter year : ");
	  int y=sc.nextInt();
	  //int y=2020;
	  System.out.print(leapYear(y));
  }
  
}