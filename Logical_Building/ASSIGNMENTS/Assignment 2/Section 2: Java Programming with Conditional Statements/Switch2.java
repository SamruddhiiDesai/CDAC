/* Error to Investigate: Why does the compiler complain about duplicate case labels?
 Whathappens when you have two identical case labels in the same switch block? */

public class Switch2 { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 //case 5:
 System.out.println("Number is 5"); 
 break; 
 //case 5: 
 case 1:
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
} 
/*error: duplicate case label
 case 5:
 
 In a switch statement, each case label must be distinct to avoid ambiguity in which
 case block should be executed when the switch expression matches a specific 
 value.
 Compiler gives syntax error*/