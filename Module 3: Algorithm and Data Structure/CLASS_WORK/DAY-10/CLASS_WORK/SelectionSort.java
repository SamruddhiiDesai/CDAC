

class SelectionSort{
   static void selectionSort(int a[]){
    int n=a.length;
	for(int i=0;i<n-1;i++){
		int min=i;
		for(int j=i;j<n;j++){
			if(a[j]<a[min])
				min=j;
		}
		int temp=a[min];
		a[min]=a[i];
		a[i]=temp;
	}
   }
   static void display(int a[]){
	   for(int i=0;i<a.length;i++){
		   System.out.print(a[i]+" ");
	   }
	    System.out.println();
   }
public static void main(String[] args){
    int a[]={2,4,1,5,3};
	display(a);
	System.out.println();
	selectionSort(a);
	display(a);
}
}