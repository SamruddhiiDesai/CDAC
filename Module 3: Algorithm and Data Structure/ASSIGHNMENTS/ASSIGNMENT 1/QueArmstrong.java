import java.util.*;
public class QueArmstrong{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Number:");
		int num=sc.nextInt();
		int arm=0;
		int temp=num;
		while(num>0){
			int rem=num%10;
			 arm=(rem*rem*rem)+arm;
			 num=num/10;
		}
		if(temp==arm){
			System.out.print(temp+" is Armstrong Number");
		}else
		{
			System.out.print(temp+" is not Armstrong Number");
		}
		sc.close();
	}
}