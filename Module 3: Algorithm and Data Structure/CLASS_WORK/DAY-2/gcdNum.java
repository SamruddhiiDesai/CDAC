import java.util.*;
/*class gcdNum{
   static String gcd(int n){
      if(n==1){
	  return "int";
	  }
	  return "gcd(int "+gcd(n-1)+" )";
   }
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:")
		int n=sc.nextInt();
		//int n=3;
	   System.out.println(gcd(n));
	}
}*/
class gcdNum{
	static int gcd(int a,int b){
		if(b==0)
			return a;
		else 
			return gcd(b,a%b);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num1: ");
		int a=sc.nextInt();
		System.out.print("Enter num2: ");
		int b=sc.nextInt();
		
		System.out.println("GCD is: "+gcd(a,b));
	}
}
