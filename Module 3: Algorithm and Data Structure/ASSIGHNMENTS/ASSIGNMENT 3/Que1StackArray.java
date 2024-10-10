
import java.util.Scanner;
class Que1StackArray{
 static final int MAX=20;
 int top;
 int a[] =new int[MAX];

Que1StackArray(){
 top=-1;
}
boolean push(int data){
	if(top>=(MAX-1)){
		System.out.print("stack overflow");
		return false;
	}
	a[++top]=data;
	return true;
}
int pop(){
	if(top<0){
		System.out.print("empty");
		return 0;
	}
	return a[top--];
}
void display(){
	if(top<0){
		System.out.print("empty");
		return ;
	}
	System.out.println("stack elements: ");
	show(top);
	System.out.println();
}
void show(int i){
	if(i<0){
		System.out.print("empty");
		return;
	}
	
	System.out.println(a[i]+" ");
	show(i-1);
	
}

public static void main(String[] args){
   Que1StackArray s1=new Que1StackArray();
   Scanner sc=new Scanner(System.in);
   
   int ch;
   do{
	   System.out.println("1.push");
	    System.out.println("2.pop");
		 System.out.println("3.display");
		  System.out.println("0.exit");
		   System.out.println("Enter choice: ");
		   ch=sc.nextInt();
		   
		   switch(ch){
			   case 1:
			   System.out.println("Enter value to stack: ");
			   int val=sc.nextInt();
			   s1.push(val);
			   break;
			   
			   case 2:
			   int p=s1.pop();
			   //if(p!=0){
				    System.out.println("Popped Element :"+p);
			   //}
			   break;
			   
			   case 3:
			   s1.display();
			   break;
			   
			   case 0:
			   System.out.println("Exit");
			   break;
			   
			   default:
			   System.out.println("Invalid");
		   }
	   
   }while(ch!=0);
   
   
}
}