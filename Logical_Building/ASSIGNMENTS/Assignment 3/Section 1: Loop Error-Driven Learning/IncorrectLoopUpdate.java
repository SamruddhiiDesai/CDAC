/*// Error to investigate: What will be the output of this loop? 
How should the loop variable be updated to achieve the desired result?*/
public class IncorrectLoopUpdate { 
 public static void main(String[] args) { 
 int i = 0; 
 while (i < 5) { 
 System.out.println(i); 
 i += 2; // Error: This may cause unexpected results in output 
 } 
 } 
} 
/*i=0--->check while condition 0<5 true then print 0--->increment i=i+2
---i=2 check condition print 2 */