/*Error to Investigate: Why does this code not compile? What does the error
 tell you about the types allowed in switch expressions? How can you modify 
 the code to make it work? */

public class Switch { 
 public static void main(String[] args) { 
 //double score = 85.0; 
 int score=85;
 switch(score) { 
 case 100: 
 //case 1+1:
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 //case 2+1:    //No error
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 
/* error: selector type double is not allowed
 switch(score) {
	 
expression used in switch statement and case labelmust be specific type . 
double ,float,long ,variable is not one of the type for  switch statement
Java switch statements support char, byte, short, int, and their corresponding
 wrapper classes (Character, Byte, Short, Integer), enum types, and String.
double (and other floating-point types like float) are not supported as types 
for the switch expression. This is because floating-point numbers can have many 
possible values with precision issues that make switch impractical for such types*/