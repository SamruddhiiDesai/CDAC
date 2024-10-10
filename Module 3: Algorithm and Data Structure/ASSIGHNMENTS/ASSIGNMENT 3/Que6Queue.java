

class Que6Queue{
	int size=10;
	int a[] =new int[size];
	int rear,front;
	
	 Que6Queue(){
		 front=-1;
		 rear=-1;
		 
	 }
	 
	 void enqueue(int data){
		 if(rear==(size-1)){
			 System.out.println("Full");	
			
		 }
		 else{
			 if(front==-1){
				 //System.out.print("Empty");
				 front=0;
			 }
			 rear++;
			 a[rear]=data;
			 //System.out.print("inserted: "+data);
		 }
		 
	 }
	 int dequeue(){
		 if(front==-1){
			System.out.print("Empty");
			return -1;
		 }else{
		 int data=a[front];
		System.out.println("deleted: "+data); 
		if(front>rear){
			rear=-1;
			front=-1;
			
		}
		else{
			front++;
		}
		return data;
		 }
	 }
	void display(){
		 if(front==-1){
			System.out.print("Empty");
			
		 }else{
		 System.out.print("Elemts: ");
		 for(int i=front;i<rear;i++){
			 System.out.print(a[i]+" ");
		 }
		 System.out.println();
		 }
	}

public static void main(String[] args){
	Que6Queue q=new Que6Queue();
	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	q.enqueue(40);
	q.display();
	
	q.dequeue();
	q.display();
	
}
}