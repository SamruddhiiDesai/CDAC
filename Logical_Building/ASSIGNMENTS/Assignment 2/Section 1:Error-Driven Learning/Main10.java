//What happens when you compile and run this code? Is method overloading allowed?

public class Main10 { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 Main10 obj = new Main10();//instance of Main10 class
 obj.display(); 
 //display();
 //display(5); 
 obj.display(5); 
 } 
} 
/* error: non-static method display() cannot be referenced from a static context
 display();
 ^
Main10.java:12: error: non-static method display(int) cannot be referenced from a static context
 display(5);
 ^
2 errors*/
/*The methods display() and display(int num) are instance methods, but in the 
main method, you are trying to call them directly without creating an instance
 of the class Main10.The code demonstrates method overloading, where the method 
 display() is overloaded with another method display(int num). This is allowed in
 Java, and it means that multiple methods can have the same name but different 
 parameters (either in number or type).*/