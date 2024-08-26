// What runtime exception is thrown? 
//Why does division by zero cause an issue in Java?

public class Main19 { 
 public static void main(String[] args) { 
 int a = 10; 
 //int b = 0; //op exception
 int b = 5; //op=2
 int result = a / b; 
 System.out.println(result); 
 } 
} 
/* Exception in thread "main" java.lang.ArithmeticException: / by zero
      at Main19.main(Main19.java:8)
	
In mathematics, division by zero is undefined because there is no number that, 
when multiplied by 0, gives a non-zero result. As a result, many 
programming languages, including Java, do not allow division by zero for integers.*/