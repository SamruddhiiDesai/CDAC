
import java.util.*;
/*class FirstChar{
  static void fchar(String str){
      if(str.length()==0){
	     return;
	  }
	   char []c=str.toCharArray();
	      for(int i=0;i<c.length;i++){
		  if(c[i]!=' '&& (i==0||c[i-1]== ' ')){
			  System.out.print(c[i]);
		  }
		  
	  }
	  //System.out.print(str.charAt(0));
	  
  }

 public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter String: ");
	 String s=sc.nextLine();
     // String s="Hii Guys";
	 
	  
     //System.out.print(fchar(s));
	 
	 
     fchar(s);
 }
}*/

class FirstChar{
  static void fchar(String str,int i){
      if(str.length()==0){
		  System.out.println("String Empty");
	     return;
	  }
	   
	     else{
			 if(i<str.length()){
			
		  if(str.charAt(i)!=' '&& (i==0||str.charAt(i-1)== ' ')){
			  System.out.println(str.charAt(i));
		  }
		  fchar(str,i+1);
		 } }
	  }
	  //System.out.print(str.charAt(0));
	  
  

 public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter String: ");
	 String s=sc.nextLine();
	 //String s="Hii Guys";
	 
	  
     //System.out.print(fchar(s));
	 
	 
     fchar(s,0);
	 
 }
}