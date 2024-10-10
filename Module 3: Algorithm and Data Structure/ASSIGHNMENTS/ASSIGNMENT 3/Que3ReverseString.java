import java.util.Scanner;

class Que3ReverseString{
	static final int MAX=50;
	int top;
	char a[]=new char[MAX];
	Que3ReverseString(){
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
	char pop(){
		if(top==-1){
			System.out.println("Empty");
			return '\0';
		}
		return a[top--];
	}
	void display(){
	if(top==-1){
		System.out.print("empty");
		return ;
	}
	
    System.out.print("Reverse String: ");
	while(top>=0){
		 System.out.print(pop()+" ");
	}
	System.out.println();
   }
	 public static void main(String[] args){
		 Que3ReverseString s1=new Que3ReverseString();
		 Scanner sc=new Scanner (System.in);
		 
		  System.out.print("Enter String: ");
		 String s=sc.nextLine();
		 
		 for(int i=0;i<s.length();i++){
			 s1.push(s.charAt(i));
		 }
		 s1.display();
	 }
}