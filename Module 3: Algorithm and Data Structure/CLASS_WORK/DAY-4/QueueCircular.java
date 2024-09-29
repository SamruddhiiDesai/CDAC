

class QueueCircular{
	int size=5;
	int CQ[]= new int[size];
    int front ,rear;    
	
	QueueCircular(){
		front=-1;   //empty 
		rear=-1;    
	}
	 
	boolean isEmpty(){   
		return (front ==-1);   //front -1 definatly empty
	}
	boolean isFull(){
		return ((rear+1)% size==front);   //0-size-1
	}
	void enqueue(int x){
		if(isFull()){
			System.out.println("Queue Full");
		}
		else{
			if(isEmpty()){    //front==-1     //only for first element insertion
				front=0;   //set front to 0 if queue is empty insert
			}
			
			rear=(rear+1)%size;  //rear increase last to first location
			CQ[rear]=x;
			System.out.println(x+" Inserted");
			
		}
	}
	int dequeue(){
		if(isEmpty()){    
			System.out.println("Queue empty");
			return -1;
		}
		else{
			int x=CQ[front];   //delete inserted elment value 
			System.out.println(x+" deleted");
			if(front==rear){   //end of queue empty queue 
				front =-1;    //reset to -1
				rear=-1;
			}
			else{
				front=(front+1)%size;
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
			int i=front;
			while(i!=rear){
				
				System.out.print(CQ[i]+" ");
				i=(i+1)%size;   //print from front to util rear
			}
			
			System.out.println(CQ[rear]);
		}
	}
		public static void main(String[] args){
		QueueCircular q1=new QueueCircular();
		q1.enqueue(11);
		q1.enqueue(12);
		q1.enqueue(13);
		q1.enqueue(14);
		q1.enqueue(11);
		q1.enqueue(11);
		q1.display();
		
		q1.dequeue();
		q1.display();
		}
	
}