

class StarPattern{
  static void starp(int n){
  
  if(n<=0){
  return;
  }
   
     System.out.print("*");
	 starp(n-1);
  }
  
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.print("Enter num : ");
	int num=sc.nextInt();
	System.out.print(starp(num));
  }
}