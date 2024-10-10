
import java.util.Scanner;
class Que2DupticateArray{

    static int dupliArray(int a[],int i,int j){
	if(i>=a.length-1){
	return -1; //no found
	}
	if(j>=a.length){
		return dupliArray(a,i+1,i+2);
	}
	
	if(a[i]==a[j]){
	 return a[j];
	}
	return dupliArray(a,i,j+1);
	}

    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size Array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.print("Enter elements : ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
       // int arr[]={1,1,2,3};
	System.out.print("Count of duplicate: "+dupliArray(arr,0,1));
 
 }
}