import java.util.*;
class Permutation{
	static int count=0;
   static void perStr(String str,String res){
     if(str.length()==0){
	    System.out.println(res+" ");
		count++;
	 return;
	 }
	 for(int i=0;i<str.length();i++){
	    char ch=str.charAt(i);
		String st=str.substring(0,i)+str.substring(i+1);
		perStr(st,res+ch);
	 }
 }
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter String: ");
   String s=sc.nextLine();
        //String s="ABC";
		perStr(s," ");
		System.out.print("Total Count of Permutation: "+count);
  }
}