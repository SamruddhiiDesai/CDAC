import java.util.*;
class RecursMulti{
   static int mul(int n){
   if(n==0){
     return 1 ;
	}
	  return n*mul(n-1);
   }

  public static void main(String[] args){
  
      int n=5;
	 System.out.println( mul(n));
  }
}