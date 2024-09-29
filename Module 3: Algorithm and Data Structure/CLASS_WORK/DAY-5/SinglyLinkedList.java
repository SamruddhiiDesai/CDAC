
class SinglyLinkedList{
	
	Node head;
    static class Node{
    int data;
	Node next;
	
	Node(int data){
	
	this.data=data;
	this.next=null;
	}
	}
	void display(){
		Node temp=head;
		while(temp!=null){
			
			System.out.print(temp.data+"--> ");
			temp=temp.next;
		}
		System.out.print("null");
	}
	void insertBeg(int new_data){
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}

     public static void main(String[] args){
		 
		 SinglyLinkedList l1=new SinglyLinkedList();
		 l1.head=new Node(10);
		 
		 Node second=new Node(20);  //pointing to null
		 Node third=new Node(30);
		 
		 l1.head.next=second;
		 second.next=third;
		 
		 l1.display();
		 
		 //insert at begining
		 System.out.println();
		 l1.insertBeg(40);
		  l1.display();
		 System.out.println();
		 l1.insertBeg(50);
		 l1.display();
	 }
}