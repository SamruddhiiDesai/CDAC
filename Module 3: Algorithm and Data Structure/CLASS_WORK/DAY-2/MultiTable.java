import java.util.*;
class MultiTable{
   static void multi(int n,int i){
     if(i>10)
	 return ;
     System.out.println(n+"*"+i+"="+(n*i));
		
	 multi(n,i+1);
   }

   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.print("Number table you want : ");
	int num=sc.nextInt();
	multi(num,1);
	
   }
}

