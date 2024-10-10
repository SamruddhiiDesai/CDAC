
class Que9MinHeap{
    static void heapify(int a[],int n,int i){
	
	int min=i;
	int right=2*i+1;
	int left=2*i+2;
	
	if(left<n&&a[left]<a[min]){
		min=left;
	
	}
	if(right<n&&a[right]<a[min]){
		min=right;
	}
	
	if(min!=i){
	  int temp=a[i];
	  a[i]=a[min];
	  a[min]=temp;
	  heapify(a,n,min);
	}
	}
	static void heapSort(int a[],int n){
		
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
		static void displayMin(int a[],int n){
		
		for(int i=n-1;i>0;i--){
		System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		int a[]={10,15,20,17};
		int n=a.length;
		System.out.print("Data:");
		display(a,n);
		heapSort(a,n);
		System.out.print("Sorted:");
		display(a,n);
		System.out.print("Min:"+a[0]);
		System.out.print("Except Min :");
		displayMin(a,n);
		
		
	}
}