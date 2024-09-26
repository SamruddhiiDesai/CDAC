

class StackArray{
	static final int MAX=10;
	int top;
	int a[]=new int[MAX];
	
	StackArray(){
		top=-1;
	}
	boolean push(int x){
		if(top>=(MAX-1)){
			System.out.println("Stack Overflow");
			return false;
		}
		 a[++top]=x;
		return true;
	}
	
	int pop(){
		if(top<0){
			System.out.println("Stack Empty");
			return 0;
		}
		//System.out.print("pop");
		return a[top--];
	}
	int peek(){
		return (top<0)? -1:a[top];
	}
	void display(){
		if(top<0){
			System.out.print("Empty");
		}
		System.out.print("Stack Elements : ");
		show(top);
		System.out.println();
		
	}
	void show(int i){
		if(i<0)
			return;
		System.out.print(a[i]+" ");
		show(i-1);
	}
	
	public static void main(String[] args){
		StackArray s1=new StackArray();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.display();
		System.out.println("Poped Element is: "+s1.pop());
		//s1.pop();
		//System.out.println("pop"+s1.pop());
		s1.display();
	}

}