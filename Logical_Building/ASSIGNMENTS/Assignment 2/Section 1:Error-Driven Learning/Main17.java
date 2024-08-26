//What compilation error occurs? Why is the ** operator not valid in Java?

public class Main17 { 
 public static void main(String[] args) { 
 //int a = 10; 
 double a=2.5; //op=97.65625
 int b = 5; 
 //int result = a ** b; 
 double result =Math.pow(a,b); //op=100000.0
 System.out.println(result); 
 } 
} 
/*error: illegal start of expression
 int result = a ** b;
 ** operator not used in java but in python it used as exponantiation a raised to b
 java has Math.pow() method for exponantiation and result is declared as double*/