//Write a program to reverse the digits of the number 1234. The output should be 4321. 

public class ReverseString{
    public static void main(String[] args){
	       String number="1234";
		   String reversed="";
		   for(int i=number.length()-1;i>=0;i--){
		    reversed += number.charAt(i);
		   }
		   System.out.println("Reveresed string:"+reversed);
		   
	}
}