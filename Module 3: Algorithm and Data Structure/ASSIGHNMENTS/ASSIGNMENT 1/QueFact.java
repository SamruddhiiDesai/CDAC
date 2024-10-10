import java.util.Scanner;

class QueFact{
	static long findFact(long n){
		if(n==0)
			return 1;
		
		
		else
			return n*findFact(n-1);
	}


	public static void main(String[] args){
		
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Enter Number:");
		long num=sc.nextLong();
		
		System.out.println("Fact of " + num + " is: " + findFact(num));
		
		sc.close();
	}
}