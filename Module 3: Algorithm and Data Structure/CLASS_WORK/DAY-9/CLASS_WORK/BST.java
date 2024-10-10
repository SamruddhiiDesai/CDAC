
class BST{
	Node root;
	static class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	BST(){
		root=null;  //for no default value  represt empty node
	}
	BST(int data){  //to connect  null root node to data
	  root=new Node(data);
	}
	Node insert(Node root,int key){
		if(root==null){
			root=new Node(key);
			return root;
		}
		if(key<=root.data)
			root.left=insert(root.left,key);
		else
			root.right=insert(root.right,key);
		return root;
		
	}
	void printinsert(int key){
		root=insert(root,key);
	}
	void printInorder(Node node){
		if(node==null)
			return;
		printInorder(node.left);
		System.out.print(node.data+" ");
		printInorder(node.right);
	}
	void inorder(){
		printInorder(root);
	}
	Node delete(Node root,int key){
		if(root==null)
			return root;
		if(key<root.data)
			root.left=delete(root.left,key);
		else if(key>root.data)
			root.right=delete(root.right,key);
		else{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			
			root.data=minvalue(root.right);
			root.right=delete(root.right,root.data);
			
		}
		return root;
	}
	int minvalue(Node root){
		int x=root.data;
		while(root.left!=null){
			x=root.left.data;
			root=root.left;
		}
		return x;
	}
	void printdelete(int key){
		root=delete(root,key);
	}
public static void main(String[] args){
    BST t1=new BST();
	
	t1.printinsert(37);
	t1.printinsert(3);
	t1.printinsert(10);
	t1.printinsert(100);
	t1.inorder();
	System.out.println();
	
	t1.printdelete(3);
	t1.inorder();
	System.out.println();
	
}
}