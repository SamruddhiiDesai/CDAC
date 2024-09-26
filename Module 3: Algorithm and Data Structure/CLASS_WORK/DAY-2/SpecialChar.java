import java.util.*;
class SpecialChar{
   static String findSpecialChar(String str){
     if(str.length()==0){
		 System.out.print("String Empty");
	 return str;
	 }
	 return str.replaceAll("[^a-zA-Z]"," ");
	 }
   
   
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter String: ");
   String str=sc.nextLine();
 // String str="Hello@Hii!&";
  System.out.print(findSpecialChar( str));
  
}
}