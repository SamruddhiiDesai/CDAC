import java.util.Scanner;

class Que2Paranthesis{
	static final int MAX=50;
	int top;
	char a[]=new char[MAX];
	Que2Paranthesis(){
		top=-1;
	}
	public boolean isEmpty(){
		return top==-1;
		
	}
		void push(char ch){
		if(top>=(MAX-1)){
			System.out.println("Stack overflow");
			return ;
		}
		a[++top]=ch;
	}
	void pop(){
		if(top==-1){
			System.out.println("Empty");
			return ;
		}
		char element =a[top--];
	}
	char peek(){
		if(top==-1){
			System.out.println("Empty");
			
		}
		return a[top];
	}
	
	void display(){
	if(top==-1){
		System.out.print("empty");
		return ;
	}
	System.out.println("stack elements: ");
	for(int i=0;i<=top;i++){
		System.out.println(a[i]+" ");
	}
	System.out.println();
   }
 

	
	
public static void main(String[] args){
     Que2Paranthesis p=new Que2Paranthesis();
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter experession :");
	 String str=sc.next();
	 
	 for(int i=0;i<str.length();i++){
		 char c=str.charAt(i);
		 
		 if(c=='('||c=='{'||c=='['){
			 p.push(c);
		 }
		 else if((c==')' && p.peek()=='(') || (c=='}' && p.peek()=='{')||(c==']' && p.peek()=='[')){
			 p.pop();
		 }
		 else if((c==')' && p.peek()!='(') || (c=='}' && p.peek()!='{')||(c==']' && p.peek()!='[')){
		System.out.println("Not Balanced");
		break;
		}
	 }
	 if(p.isEmpty()){
		 System.out.println("Balanced");
	 }
}
}
