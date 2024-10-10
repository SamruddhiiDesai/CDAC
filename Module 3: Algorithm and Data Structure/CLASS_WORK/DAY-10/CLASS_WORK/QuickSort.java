
class QuickSort{
  static void quickSort(int a[],int low ,int high){
    if(low<high){
		int pi=partition(a,low,high);
		quickSort(a,low,pi-1);
		quickSort(a,pi+1,high);
		
	}
  }
  static int partition(int a[],int low,int high){
	  int pivot=a[high];
	  int i=low-1;
	  for(int j=low;j<high;j++){
		  if(a[j]<pivot){
			  i++;
			  swap(a,i,j);
		  }
		   
	  }
	  swap(a,i+1,high); 
	  return i+1;
  }
  static void swap(int a[],int i,int j){
	  int temp=a[i];
	  a[i]=a[j];
	  a[j]=temp;
	  
  }
  
  static void display(int a[]){
  for(int i=0;i<a.length;i++){
  System.out.print(a[i]+" ");
  }
  System.out.println();
  }
  public static void main(String[] args){
    int a[]={10,15,1,2,9,16,11};
	int n=a.length;
	System.out.print("Unsorted Array: ");
	display(a);
	
    quickSort(a,0,n-1);
	System.out.print("Sorted Array: ");
	display(a);
  }
}