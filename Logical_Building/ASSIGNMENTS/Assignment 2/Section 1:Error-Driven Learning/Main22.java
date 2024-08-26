//What syntax error occurs? Can a method be declared inside another method?

/*public class Main22 { 
 public static void main(String[] args) { 
 static void displayMessage() { 
 System.out.println("Message"); 
 } 
 } 
} 
*/
/* error: illegal start of expression
 static void displayMessage() {
 ^
Main22.java:9: error: class, interface, enum, or record expected
}*/
/*In java method can not declare in side the other method
methods are declare inside class but outside method*/

public class Main22 { 
 public static void main(String[] args) { 
         displayMessage();    //call method
 }
 static void displayMessage() { 
 System.out.println("Message"); 
                     //op=Message
 } 
} 