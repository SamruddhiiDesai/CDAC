
import java.util.*;
class Que8ArrayManupulation{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
        int size = sc.nextInt();
		int queries = sc.nextInt();
		int[] arr = new int[size];
		int max=0;
		
		for(int i=0;i<queries;i++){
			
			int fIndex =sc.nextInt()-1;  
			int sIndex =sc.nextInt()-1;
			int num =sc.nextInt();
			
			for(int j=fIndex;j<=sIndex;j++){
				arr[j]+=num;
				
				max=arr[j]>max? arr[j]:max;
			}
		}
		
		System.out.println("Max Number : "+max);
       
	}
}