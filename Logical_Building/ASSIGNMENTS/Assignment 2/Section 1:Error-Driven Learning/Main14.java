// What compilation error occurs? Why does Java enforce data type constraints?

public class Main14 { 
 public static void main(String[] args) { 
 //double num = "Hello"; 
 double num = 1.2;   //op=1.2
 System.out.println(num); 
 } 
} 
/*error: incompatible types: String cannot be converted to double
 double num = "Hello";
  double is primitive datatype used to store decimal numbers and Hello is string character
  
  
  variables hold data of correct datatype for avoid errors, different 
  datatype has different memory*/
