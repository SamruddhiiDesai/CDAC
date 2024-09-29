

class QueueSimple{
	int size=5;
	int Q[]= new int[size];
    int front ,rear;    
	
	QueueSimple(){
		front=-1;   //empty 
		rear=-1;    
	}
	 
	boolean isEmpty(){   
		return (front ==-1);   //front -1 definatly empty
	}
	boolean isFull(){
		return (rear==size-1);   //0-size-1
	}
	void enqueue(int x){
		if(isFull()){
			System.out.print(" Queue Full");
		}
		else{
			if(isEmpty()){    //front==-1     //only for first element insertion
				front=0;   //set front to 0 if queue is empty insert
			}
			rear++; //rear increase
			Q[rear]=x;
			System.out.println(x+" Inserted");
			
		}
	}
	int dequeue(){
		if(isEmpty()){    
			System.out.println("Queue empty");
			return -1;
		}
		else{
			int x=Q[front];   //delete inserted elment value 
			System.out.println(x+" deleted");
			if(front>rear){   //end of queue empty queue 
				front =-1;    //reset to -1
				rear=-1;
			}
			else{
				front++;
			}
			return x;
		}
	}
	void display(){
		if(isEmpty()){
			System.out.println(" Display Empty");
		}
		else{
			System.out.print("Queue element : ");
			for(int i=front;i<=rear;i++){  //print from front to upto  rear
			System.out.print(	Q[i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		QueueSimple q1=new QueueSimple();
		q1.enqueue(11);
		q1.enqueue(12);
		q1.enqueue(13);
		q1.enqueue(14);
		q1.display();
		
		q1.dequeue();
		q1.dequeue();
	    q1.dequeue();
	    q1.dequeue();
		 q1.dequeue();
		 //q1.dequeue();
		q1.display();
		
	}
 
}