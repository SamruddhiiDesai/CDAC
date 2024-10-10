

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
		System.out.print("Enter Array : ");
		int arr[]=sc.nextInt();
       // int arr[]={1,1,2,3};
	System.out.print("Count: "+dupliArray(arr,0,1));
 
 }
}