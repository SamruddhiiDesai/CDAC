
import java.util.Scanner;
class Que4Postfix{
  static final int MAX=20;
  int top;
  int a[]=new int[MAX];
  
  Que4Postfix(){
	  top=-1;
  }
  
  void push(int data){
	  if(top>=(MAX-1)){
		  System.out.println("Stack overflow");
		  return;
	  }
	  a[++top]=data;
	  
  }
	int pop(){
		if(top==-1){
			System.out.println("Stack underflow");
			return 0;
		}
		return a[top--];
	}
  void display(){
	  if(top==-1){
		System.out.println("Stack underflow");  
        return;		
	  }
	  System.out.println("Elements are:");
      for(int i=0;i<top;i++){
		  System.out.print(a[i]+" ");
	  }	
 System.out.println();	  
  }

public static void main(String[] args){
	Que4Postfix p=new Que4Postfix();
   Scanner sc=new Scanner(System.in);
   System.out.print("Expression: ");
     String str=sc.nextLine();
	str = str.replaceAll(" ","");
	 
   for(int i=0;i<str.length();i++){
	   char elemnt=str.charAt(i);
   if(elemnt=='+'||elemnt=='-'||elemnt=='*'||elemnt=='/'){
	  int n2= p.pop();
	  int n1=p.pop();
	  
	  switch(elemnt){
		  case '+':
		  p.push(n1+n2);
		  break;
		  
		  case '-':
		  p.push(n1-n2);
		   break;
		   
		  case '*':
		  p.push(n1*n2);
		  break;
		  
		  case '/':
		  p.push(n1/n2);
		  break;
	  }
   }else{
	   p.push(elemnt-'0');
   }
   }
   System.out.println("Result:"+p.pop());
  
}
}