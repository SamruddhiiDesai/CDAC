
import java.util.*;

class Que6ReverseWord{

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter String : ");
	String str=sc.nextLine();
	
	String arr[]=str.split(" ");
	
	
	for(int i=arr.length-1;i>=0;i--){
		System.out.print(arr[i]+" ");
	}
	
}
}