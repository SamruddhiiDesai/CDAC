import java.util.Scanner;
class RecursGCD{

   static String rfun(int n){
   if(n==1){
     return "int";
   }
     return "gcd(int ," +rfun(n-1)+")";
   }
   public static void main(String[] args){
	   Scanner sc=new Scanner (System.in);
	   System.out.print("Enter Num:");
	   int n=sc.nextInt();
	   
     
		System.out.print(rfun(n));
   }
}