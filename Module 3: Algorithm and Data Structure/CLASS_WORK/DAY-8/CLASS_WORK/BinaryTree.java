

class BinaryTree{
	Node root;
	static class Node{
		int data;
		Node right,left;
		
		Node(int data){
			this.data=data;
			left=right=null;
		}
}
BinaryTree(){

	root=null;
}
BinaryTree(int data){
	root=new Node(data);
}
void printInorder(Node node){
	if(node==null)
		return;
	
	printInorder(node.left);
	System.out.println(node.data+" ");
	printInorder(node.right);
}
void inorder(){
	printInorder(root);  
}
void printPreorder(Node node){
	if(node==null)
		return;
	
	System.out.println(node.data+" ");
	printPreorder(node.left);
	printPreorder(node.right);
}
void preorder(){
	printPreorder(root);
}
void printPostorder(Node node){
	if(node==null)
		return;
	
	printPostorder(node.left);
	printPostorder(node.right);
	System.out.println(node.data+" ");
}
void postorder(){
	printPostorder(root);
}
public static void main(String[] args){
	BinaryTree t1=new BinaryTree();
	//BinaryTree t2=new BinaryTree(100);  //new instatice  100 
	t1.root=new Node(11);  //first node
	t1.root.left=new Node(22);
	t1.root.right=new Node(33);
	t1.root.left.left=new Node(44);
	t1.root.left.right=new Node(55);
	
	System.out.println("Inorder :");
	t1.inorder();
	System.out.println();
	
	System.out.println("Postorder :");
	t1.postorder();
	System.out.println();
	
	System.out.println("Preorder :");
	t1.preorder();
	System.out.println();
	
}

}