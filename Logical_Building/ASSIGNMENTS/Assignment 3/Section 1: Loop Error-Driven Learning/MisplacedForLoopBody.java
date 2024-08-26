/*6// Error to investigate: Why does "Done" print only once, outside the loop? 
How should the loop body be enclosed to include all statements within the loop? */
/*public class MisplacedForLoopBody { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) 
 System.out.println(i); 
 System.out.println("Done"); 
 } 
} */

/*there is no curly braces it execute only once done and loop executed
untill condition falls*/
public class MisplacedForLoopBody { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) {
 System.out.println(i); 
 System.out.println("Done"); 
 }
 } 
} 