
import java.util.*;
class LinearSearch{
    static int Linear(int a[],int x){
	   for (int i=0;i<a.length;i++){
	  if( a[i]==x)
	   return i;
	   }
	   return -1;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	//int a[]={44,66,77,33,55,88,99};
	//int x=88;
	int x=sc.nextInt();
	
	int res=Linear(a,x);
	if(res==-1)
		System.out.print("Not found");
	else
		System.out.print("Found at "+res+" index");
	}
}