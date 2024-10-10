
class DoublyLinkedList{
	
	Node head;
	
static class Node{
    int data;
	Node prev;
	Node next;
	
	Node(int data){
		this.data=data;
		prev=null;
		next=null;
	}
}

void display(Node n){
	//Node n=head;
	Node p=null;
	System.out.print("Forward : ");
	while(n!=null){
		System.out.print(n.data+"-->");
		p=n;
		n=n.next;
	}
	System.out.println("Null");
	
	System.out.print("Reverse : ");
	System.out.print("Null <--");
	while(p!=null){
		System.out.print(p.data+"<--");
		p=p.prev;
		
	}
	
}

void insertBeg(int new_data){
	Node new_node=new Node(new_data);
	new_node.next=head;
	new_node.prev=null;
	if(head!=null){
		//head=new_node;
		head.prev=new_node;
		return;
	}
	
	head.prev=new_node;
	head=new_node;
	
}
void insertAfter(Node prev_node,int new_data){
	
	if(pre_node==null){
		System.out.println("Empty");
		return;
	}
	Node new_node=new Node(new_data);
	new_node.next=prev_node.next;
	new_node.prev=prev_node;
	prev_node.next=new_node;
	if(new_node.next!=null){    //insert at end
	new_node.next.prev=new_node;
	}
	
}
void append(int new_data){   //append  insert at end
	Node new_node=new Node(new_data);
	Node last=head;
	new_node.next=null;
	if(head==null){
		new_node.prev=null;
		head=new_Node;
		
		return;
	}
	while(last.next!=null){
		last=last.next;//traverse till last.next=null
	}
	last.next=new_node;
	new_node.prev=last;

}
void deleteNode(Node del){
	
	//empty
	if(head==null || del ==null)
		return;
	
	//delete at begining
	if(head==del){
		head=del.next;
	}
	
	//delete in between
	if(del.next!=null){
		del.next.prev=del.prev;
		
	}
	if(del.prev!=null){
		del.pre.next=del.next;
	}
	return;
}

public static void main(String[] args){
	
	DoublyLinkedList d1=new DoublyLinkedList();
	d1.insertBeg(10);
	d1.insertBeg(20);
	d1.insertBeg(30);
	d1.display(d1.head);
	System.out.println();
	d1.insertAfter(d1.head,10);
	d1.display(d1.head);
	
	System.out.println();
	
	d1.append(100);
	d1.display(d1.head);
	System.out.println();
	
	d1.deleteNode(d1.head.next);
	d1.display(d1.head);
	System.out.println();
}
}