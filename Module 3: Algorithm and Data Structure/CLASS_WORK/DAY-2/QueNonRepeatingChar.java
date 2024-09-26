 
 import java.util.*;
 class QueNonRepeatingChar {
     
   
    static char findNonRepeating(String str, int i) {  
       if(i>=str.length()){
		   return '\0';
	   }
	   char firstChar=str.charAt(i);
	   
	   if(str.indexOf(firstChar)==str.lastIndexOf(firstChar)){
		   return firstChar;
	   }
	   return findNonRepeating(str,i+1);
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
        String s = sc.nextLine();  
        
        System.out.println("Non repeating Character : "+findNonRepeating(s,0));
       
    }
}
