
import java.util.*;
class Que10LeftRotation{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size : ");
		int size=sc.nextInt();
		System.out.print("Enter element : ");
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter index rotation : ");
		int d=sc.nextInt();
		
		int i=d;
		while(true){
			System.out.print(arr[i]+" ");
			i=(i+1)%size;
			
			if(i==d-1){            //upto index=1 
				System.out.println(arr[d-1]);
				break;
			}
		}
		
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

/*
 public static void leftRotate(int[] arr,int start ,int end) {
        int n = arr.length;
        int d = d % n; 

        // Reverse  first d elements
        leftRotate(arr, 0, d - 1);

        // Reverse the remaining elements
        leftRotate(arr, d, n - 1);

        // Reverse the entire array
        leftRotate(arr, 0, n - 1);
		
		   while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

   /* private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        System.out.println("Original array: " + Arrays.toString(arr));
        leftRotate(arr ,d);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
*/