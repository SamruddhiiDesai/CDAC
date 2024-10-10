
class BinarySearch{
	static int bsearch(int a[],int x,int low,int high){
		if(high>low){
			int mid=low+(high-low)/2;
			if(a[mid]==x)
				return mid;
			if(a[mid]>x)
				return bsearch(a,x,low,mid-1);
			
			return bsearch(a,x,mid+1,high);   //low and high compare with key and decise where to go
		}
		return -1;
	}
public static void main(String[] args){
  int a[]={11,22,33,44,55,66};
  int x=55;
  int n=a.length;
  int res=bsearch(a,x,0,n-1);
  if(res==-1)
		System.out.print("Not found");
	else
		System.out.print("Found at "+res+" index");  
}
}