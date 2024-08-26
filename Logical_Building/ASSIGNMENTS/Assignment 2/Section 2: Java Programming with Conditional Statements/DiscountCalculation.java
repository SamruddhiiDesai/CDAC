/*Question 4: Discount Calculation 
Write a program to calculate the discount based on the total purchase amount. 
Use the following criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%. 
*/


public class DiscountCalculation {
	public static void main(String[] args){
		
		int Purchase_Amount=9000;
		String Membership_Card="Yes";
		String Membership_Card="No";
		if(Purchase_Amount>=1000){
		
		if(Membership_Card=="Yes"){
			System.out.println("25% discount");
			
		}else
		{
			System.out.println("20% discount");
		}
		}
		else if(Purchase_Amount>=500){
		
		if(Membership_Card=="Yes"){
			System.out.println("15% discount");
			
		}else
		{
		System.out.println("15% discount");		
		}
		}
		else 
		{
			if(Membership_Card=="Yes"){
			System.out.println("10% discount");
			
		}else
		{
		System.out.println("5% discount");
		}
		}
		
}
}