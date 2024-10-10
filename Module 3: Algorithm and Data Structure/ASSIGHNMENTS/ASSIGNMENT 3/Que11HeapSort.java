
class Que11HeapSort{
	
static void heapify(int a[],int n,int i){
	
  int largest=i;
  int left=2*i+1;
  int right=2*i+2;
  
 if(left<n&&a[left]>a[largest]){
	   
     largest=left;
  }
  if(right<n&&a[right]>a[largest]){
	  
  largest=right;
  }
  
  if(largest!=i){     //if large value update
     int temp=a[i];
	 a[i]=a[largest];
	 a[largest]=temp;
	 
	 heapify(a,n,largest);
  }
   
}
/*static void heapsort(int a[],int n){
	//int n=a.length;
	for(int i=n/2-1;i>=0;i--){  //start from last non leaf node   ---call heapify this turn to max heap
		 heapify(a,n,i);
	}
	for(int i=n-1;i>0;i--){   //swap root of max heap to last element
		int temp=a[0];       
		a[0]=a[i];              //reduse size of heap 
		a[i]=temp;
		
		heapify(a,i,0);  //re heapifiy heap untill all sorted
	}
	
	
}*/
static void display(int a[],int n){
	//int n=a.length;
	
	for(int i=0;i<n;i++){
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
}
 public static void main(String[] args){
      //Que11HeapSort h1=new Que11HeapSort();
	  int a[]={99,66,77,44,33,88,11};
	  int n=a.length;
	  System.out.print("Elemets: ");
	  display(a,n);
	 // heapsort(a,n);
	  //System.out.print("After Sort :");
	  display(a,n);
    
 }
}