

class Que10MaxHeap{
   static void heapify(int a[],int n,int i){
	   
               int max=i;
			   int right=2*i+1;
			   int left=2*i+2;
			   
			  
			   if(left<n&&a[left]>a[max]){
				   max=left;
			   }
			   if(right<n&&a[right]>a[max]){
				   max=right;
			   }
			   if( max!=i){
				   int temp=a[i];
				   a[i]=a[max];
				   a[max]=temp;
				   
				   heapify(a,n, max);
			   }
   }
   static void heapsort(int a[],int n){
	//int n=a.length;
	for(int i=n/2-1;i>=0;i--){
		 heapify(a,n,i);
	}
	for(int i=n-1;i>=0;i--){
		int temp=a[0];
		a[0]=a[i];
		a[i]=temp;
		
		heapify(a,i,0);
	}

}
   static void display(int a[],int n){
	   
	   for(int i=0;i<n;i++){
		   System.out.print(a[i]+" ");
	   }
	   System.out.println();
	   
   }
   static void displayAll(int a[],int n){
	   for(int i=0;i<n-1;i++){
		   System.out.print(a[i]+" ");
	   }
	   System.out.println();
	   
   }
   

public static void main(String[] args){
int a[]={22,66,77,44,33,88,99};
	  int n=a.length;
	  System.out.println("Elemets: ");
	  display(a,n);
	  heapsort(a,n);
	  System.out.println("Sorted:");
	  display(a,n);
	  System.out.println("Max: "+a[n-1]);
	  System.out.println("Sorted except max:");
       displayAll(a,n);
	   
}
}