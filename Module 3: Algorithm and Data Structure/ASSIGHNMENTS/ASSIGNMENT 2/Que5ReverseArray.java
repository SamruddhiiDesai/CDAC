import java.util.*;
class Que5ReverseArray{
   static void revArray(int a[]){
   if(a.length<0){
   return;
   }
    for (int i=a.length-1;i>=0;i--){
	System.out.print(a[i]+" ");
   }	
   
   }
   public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter size : ");
	   int size=sc.nextInt();
	   int arr[]=new int[size];
	   System.out.print("Enter elements : ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
    //int arr[]={1,1,2,3};
	revArray(arr);
   
   }
}