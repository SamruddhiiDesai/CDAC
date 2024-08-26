/*// Error to investigate: Why does the variable 'x' cause a compilation error? 
How does scope*/

/*public class LoopVariableScope { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2; 
 } 
 System.out.println(x); // Error: 'x' is not accessible here 
 } 
} */
/*here x is initialise within the for curly braces so there scope is only
within the curly bracec*/
public class LoopVariableScope { 
 public static void main(String[] args) { 
 int x = 0;
 for (int i = 0; i < 5; i++) { 
  x = i * 2; 
 } 
 System.out.println(x); // 'x' is accessible here 
 } 
}
/*
x=0*2=0
i=1
x=1*2=2
i=2
x=2*2=4
i=3
.
.
i=4
x=4*2=8
termineted
*/