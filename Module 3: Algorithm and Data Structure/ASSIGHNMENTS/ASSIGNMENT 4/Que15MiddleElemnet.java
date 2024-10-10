class Que15MiddleElemnet{

  static class Node{
	  int data;
	  Node next;
	  
	  Node(int data){
		  this.data=data;
		  next=null;
	  }
  }
  Node head=null;
  
 void insertBeg(int new_data){
	  Node new_node=new Node(new_data);
	  if(head==null){
		  head=new_node;
	  }else{
	  new_node.next=head;
	  head=new_node;
	  }
  }
  
  void display(){
	  Node temp=head;
	  while(temp!=null){
		   System.out.print(temp.data+"-->");
		  temp=temp.next;
	  }
	  System.out.print("null");
  }
  /*Node reverse(){
	  Node prev=null;
	  Node next=null;
	  Node curr=head;
	  
	  while(curr!=null){
		  next=curr.next;
		  curr.next=prev;
		  prev=curr;
		  curr=next;
	  }
	  head=prev;
	  return head;
  }
  
  void middleElement(){
	  Node ptr1=head;
	  Node ptr2=head;
	  
	  while(ptr2!=null && ptr2.next!=null){
		  ptr1=ptr1.next;
		  ptr2=ptr2.next.next;
	  }
	  System.out.print(ptr1.data);
	  
  }
  boolean detectLopp(Node head){
	  
	  Node slow=head;
	  Node fast=head;
	  
	  while(fast!=null && fast.next!=null){
		  slow=slow.next;
		  fast=fast.next.next;
		  
		  if(slow==fast){
			  return true;
		  }
	  }
	  return false;
  }*/
  Node merge(Node l1,Node l2){
	  if(l1==null)
		  return l2;
	  if(l2==null)
	     return l1;
	 
	  if(l1.data<l2.data){
		  l1.next=merge(l1.next,l2);
		  return l1;
	  }
	  else{
		  l2.next=merge(l1,l2.next);
		  return l2;
	  }
  }
   void removeDuplicates()
    {
        Node curr = head;
        /* Traverse list till the last node */
        while (curr != null) {
            Node temp = curr;
            /*Compare current node with the next node and
            keep on deleting them until it matches the current
            node data */
            while(temp!=null && temp.data==curr.data) {
                temp = temp.next;
            }
            /*Set current node next to the next different
            element denoted by temp*/
            curr.next = temp;
            curr = curr.next;
        }
    }
  
  public static void main(String[] args){
	  Que15MiddleElemnet r1=new Que15MiddleElemnet();
	  r1.insertBeg(10);
	  r1.insertBeg(20);
	  r1.insertBeg(30);
	  r1.insertBeg(40);
	  r1.insertBeg(20);
	  System.out.print("List : ");
	  r1.display();
	  System.out.println();
	 /* System.out.println();
	  System.out.print("Reverse: ");
	  r1.reverse();
	  r1.display();
	  
	  System.out.println();
	  System.out.print("Middle Element :");
	  r1.middleElement();
	  
	  System.out.println();
	 boolean dl= r1.detectLopp(r1.head);
	 System.out.println("detect loop: "+dl);
	 
	  r1.head.next.next = r1.head.next;
	    dl= r1.detectLopp(r1.head);
	 System.out.println("detect loop in sec: "+dl);*/
	 
	  Que15MiddleElemnet r2=new Que15MiddleElemnet();
	   r2.insertBeg(11);
	  r2.insertBeg(22);
	  r2.insertBeg(33);
	  r2.insertBeg(44);
	  // System.out.print("List 1 : ");
	  // r1.display();
	    System.out.print("List 2 : ");
	   r2.display();
	   System.out.println();
	 Node mergelist=r1.merge(r1.head,r2.head);
	 
	 System.out.print("MList:");
	 Node temp=mergelist;
	 while(temp!=null){
		 System.out.print(temp.data+"-->");
		 temp=temp.next;
	 }
	 
	  System.out.println("null\n");
	  Que15MiddleElemnet r3=new Que15MiddleElemnet();
	   r3.insertBeg(11);
	  r3.insertBeg(22);
	  r3.insertBeg(22);
	  r3.insertBeg(44);
	  r3.removeDuplicates();
	  System.out.println("dddddd");
	  r3.display();
	  System.out.println();
	  
  }
}


   