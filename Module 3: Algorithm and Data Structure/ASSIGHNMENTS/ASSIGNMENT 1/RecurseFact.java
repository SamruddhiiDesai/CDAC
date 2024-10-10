import java.util.*;

class RecurseFact{
 static int fact(int n){
 if(n==0)
 return 1;
 else 
 return n*fact(n-1);
 }
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	int num=sc.nextInt();
	System.out.println("Enter num:"+num);
//+int number=6;
System.out.println("Fact:"+fact(num));
}
}