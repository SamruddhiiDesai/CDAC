import java.util.Scanner;

/*class QueFibonacci{

static void findFib(int n){
	int num1=0,num2=1;
	
	if(n<=1){
		System.out.println("Enter Number is not positive" );
		return;
	}
	if(n==1){
		System.out.println(num1);
		return ;
	}
	
		System.out.print("Fibonacci series: [" + num1 + "," + num2);
		for(int i=2;i<=n-1;i++){
			int temp=num1+num2;
		System.out.print("," + temp);
			num1=num2;
			num2=temp;
		}
		
		
          System.out.print("]");
}
 public static void main(String[] args){
 
    Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number:" );
	int num=sc.nextInt();
	
	findFib(num);
	
	sc.close();
 }
 }*/
 
 //fib(3)=fib(2)+fib(1)=fib(n-1)+fib(n-2)
  //      = fib(1)+fib(0)+1
  
  class QueFibonacci{
	  static int fib(int n){
		  if(n<=1){
			  return n;
		  }
		  return fib(n-1)+fib(n-2);
	  }
	  public static void main(String[] args){
		  Scanner sc=new Scanner(System.in);
	       System.out.print("Enter Number:" );
	     int num=sc.nextInt();
		 
		 for(int i=0;i<=num-1;i++){
			 System.out.print(fib(i)+ " ");
		 }
		  
	  }
  }