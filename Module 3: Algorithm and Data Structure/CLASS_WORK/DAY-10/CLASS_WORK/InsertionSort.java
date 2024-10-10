

class InsertionSort{
 static void insersionSort(int a[]){
	 
	 for(int i=1;i<a.length;i++){
		 int key=a[i];
		 int j=i-1;
		 while(j>=0 && a[j]>key){
			 a[j+1]=a[j];
			 j=j-1;
		 }
		 a[j+1]=key;
	 }
 }
 static void display(int a[]){
	 for(int i=0;i<a.length;i++){
		 System.out.print(a[i]+" ");
	 }
	 System.out.println();
 }
 public static void main(String[] args){
	 int a[]={4,2,1,5,3};
	 display(a);
	  System.out.println();
	 insersionSort(a);
	 display(a);
	 
 }
}