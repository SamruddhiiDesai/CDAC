/*// Error to investigate: Why does the loop only execute once? 
What is wrong with the loop condition in the `do while` loop? */

public class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num); 
// num++; 
 num--; //for exit dec then cond false loop exit
 } while (num > 0); 
 } 
} 
 /*the infinite loop as output
 print 0 ->0++->1->check condition 1>0 true then again print 1->incr1++->check condition
 2>0true ....infite loop*/
