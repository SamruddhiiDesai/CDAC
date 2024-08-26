//Can you have multiple main methods? What do you observe?


public class Main5 { 
 /*public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } */
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
} 

/*multiple main methods in a Java class, only one of them can be the entry point.
 The other main methods will not be executed unless you call them 
 explicitly from within the program.
 Only execute the one main method that contains String[] args
 when we call another method Error: Main method not found in class Main5,
 please define the main method as: public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application*/
