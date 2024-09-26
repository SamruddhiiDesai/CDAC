import java.util.*;
class prime{
	
	static boolean checkPrime(int num){
		if(num<=1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++){
			
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
}
public class QuePrime{
	public static void main(String[] args){
		//prime pn=new prime();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		
		if(prime.checkPrime(num)){
			System.out.println(num+" is prime number");
		}
		else{
			System.out.println(num+ " is not prime number");
		}
		sc.close();
	}
}