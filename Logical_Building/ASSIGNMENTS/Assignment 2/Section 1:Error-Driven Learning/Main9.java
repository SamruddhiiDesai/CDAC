//What error occurs? Why can't reserved keywords be used as identifiers?

public class Main9 { 
 public static void main(String[] args) { 
 //int class = 10; 
 int class1 = 10;
 
 System.out.println(class1); 
 } 
} 
/*Main9.java:5: error: not a statement
 int class = 10;
 ^
Main9.java:5: error: ';' expected
 int class = 10;
    ^
Main9.java:5: error: <identifier> expected
 int class = 10;
          ^
Main9.java:6: error: illegal start of expression
 System.out.println(class);
                    ^
Main9.java:6: error: <identifier> expected
 System.out.println(class);
                         ^
5 errors*/
 /*class is reserved keyword ie predefined that can not use as variable or identifier*/