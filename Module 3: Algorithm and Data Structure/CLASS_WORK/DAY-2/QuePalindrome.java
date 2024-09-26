
import java.util.*;
class QuePalindrome{
  static boolean palindrome(int n){
	 
	  int rev=0;
	  int orig=n;
	  while(n!=0){
	  int d=n%10;
	  rev= rev*10+d;
	  n=n/10;
	  }
	  return orig == rev;
	  
	  
  }

  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter Number: ");
	  int num=sc.nextInt();
    //int num=12321;
	if(palindrome(num)){
	System.out.print(num+" is Palinedrome");
	}
	else{
	System.out.print(num+" is Not Palindrome");
	}
	
	
  }
}