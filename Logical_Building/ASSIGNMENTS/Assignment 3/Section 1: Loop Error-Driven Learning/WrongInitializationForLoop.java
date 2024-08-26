/*// Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the 
initialization and update statements in the `for` loop?*/
public class WrongInitializationForLoop { 
 public static void main(String[] args) { 
 //for (int i = 10; i >= 0; i++) 
 for (int i = 0; i <= 10; i++) { //it prints 0 to 10
 System.out.println(i); 
 } 
 } 
} 

/*Infinite loop
according to condition i=10-->check condition 10>=0 true-->print 10-->inc i to 11
at this way loop infite*/
 
