import java.util.Scanner;

class TowerOfHanoi{
	static int count=0;
    static void toh(int n,char s,char inter,char d){
		 if(n==1){
			 System.out.println("Disk from "+s+" to "+d);
			 
		 }
		 else{
			 toh(n-1,s,d,inter);
			 System.out.println("Disk from "+s+" to "+d);
			 toh(n-1,inter,s,d);
			  count++;
			 
		 }
	 }

     public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter nu of Disk:");
		 int n=sc.nextInt();
		 
	  // int n=3;
	   toh(n,'A','B','C');
	    System.out.print("Count: "+count);
	 }
}