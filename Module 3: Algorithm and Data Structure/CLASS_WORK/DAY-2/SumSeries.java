import java.util.*;
class SumSeries{
    static double sum(int n){
       if(n==1){
	   return 1.0;
	   }
       else{
		   if(n%2==0){
		       return -1.0/ n + sum(n-1);
		   }
	       else{
		   return +1.0/ n + sum(n-1);
		   }
	   }  
   }
   public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter Number: ");
	   int num=sc.nextInt();
       System.out.print(sum(num));   
   }
}


