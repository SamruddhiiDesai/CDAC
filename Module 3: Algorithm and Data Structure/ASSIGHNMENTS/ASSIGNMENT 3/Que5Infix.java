
class Que5Infix{
	static final int Max=20;
	int top;
	cha a[]=new char[MAX];
	
	Que5Infix(){
		top=-1;
	}
	
	void push(int data){
		if(top>=(MAX-1)){
			System.out.println("Stack overflow");
			return;
		}
	    a[++top]=data;
	}
	char pop(){
		if(top==-1){
			System.out.println("Stack UnderFlow");
			return '/0';
		}
		return a[--top];
	}
	void display(){
		if(top==-1){
		System.out.println("Stack UnderFlow");
         return;		
		}
		System.out.print("Elemnts");
		for(int i=0;i<top;i++){
			System.out.println(a[i]+" ");
		}
		System.out.println();
	}
	
	

public staticvoid main(String() args){
    
}
}