// What error occurs when compiling this code? How should you handle different data types 
//in operations?

public class Main15 { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 double result = num1 + num2;  //op=15.5
 //int result = (int)(num1 + num2); //explicit casting
 int result = num1 + num2; 
 System.out.println(result); 
 } 
} 
/* error: incompatible types: possible lossy conversion from double to int
 int result = num1 + num2;*/
 /*java does not have implicit conversion from double to int
 we have to perform explicit casting or we have to store result into double*/