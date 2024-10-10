   
import java.util.*;
class Que7ReverseNumber{
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		int rev=0,rem;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.print("Revere: "+rev);
		
	}
}