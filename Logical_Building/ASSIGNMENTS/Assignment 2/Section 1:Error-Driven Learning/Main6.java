//What error occurs? Why must variables be declared?

/*public class Main6 { 
 public static void main(String[] args) { 
 int x = y + 10; 
 System.out.println(x); 
 } 
} */
/*error: cannot find symbol
 int x = y + 10;
         ^
  symbol:   variable y
  location: class Main6
1 error

variables are essential for storing and manipulating data. Declaring a variable
 establishes a memory location where a specific type of data can be held.*/
 
 public class Main6 { 
 public static void main(String[] args) { 
 int y=10;
 int x = y + 10; 
 System.out.println(x); 
 } 
} 