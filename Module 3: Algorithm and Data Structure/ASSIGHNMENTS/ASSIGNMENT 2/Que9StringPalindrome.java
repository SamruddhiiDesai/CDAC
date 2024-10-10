
import java.util.*;
class Que9StringPalindrome{

  public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter String : ");
	String str=sc.nextLine();
	
	StringBuilder s=new StringBuilder(str);
	s.reverse();
	
	if(str.equals(s.toString())){
		
		System.out.print("True");
	}else{
		System.out.print("False");
	}
  }
}