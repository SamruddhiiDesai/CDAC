
/*class BubbleSort{
	static void bubbleSort(int a[])
	{
		int count=0;
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++){
				count++;
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
                	
                display(a);
           				
			}
			System.out.println();
			 			 
		}
		System.out.println("Total comarisions: "+count);	
	}
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");     
		}
		System.out.println();
	}
public static void main(String[] args){
	int a[]={5,3,4,1,2};
	System.out.print("Unorted Array: ");	
	display(a);
	bubbleSort(a);
	System.out.print("Sorted Array: ");	
	display(a);
}
}*/
//WIth flag
class BubbleSort{
	static void bubbleSort(int a[])
	{
		int count=0;
		boolean flag;
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			flag=false;
			for(int j=0;j<n-1-i;j++){
				count++;
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=true;
				}
                	
                display(a);
           				
			}
			System.out.println();
			 if (!flag) {
                break;
            }			 
		}
		System.out.println("Total comarisions: "+count);	
	}
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");     
		}
		System.out.println();
	}
public static void main(String[] args){
	int a[]={4,3,3,4,5};
	System.out.print("Unorted Array: ");	
	display(a);
	bubbleSort(a);
	System.out.print("Sorted Array: ");	
	display(a);
}
}