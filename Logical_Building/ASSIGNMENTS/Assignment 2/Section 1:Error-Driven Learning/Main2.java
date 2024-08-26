//What error do you encounter? Why is void used in the main method?
/*
public class Main2 { 
 public static int main(String[] args) { 
 System.out.println("Hello, World!"); 
 return 0; 
 } 
} */
/* error: Main method not found in class Main2, please defiine the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application*/

/*the main method is a special method that is used as the entry point
 for a Java program. It doesn't need to return a value because its primary 
 purpose is to execute the program's logic.
 void in the main method signifies that it doesn't produce any output value 
 that can be used by other parts of the program.
*/
public class Main2 { 
 public static void main(String args[]) { 
 System.out.println("Hello, World!"); 
 
 } 
} 