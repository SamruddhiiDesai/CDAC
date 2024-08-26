/*7// Error to investigate: Why does this code produce a compilation error? 
What needs to be done to initialize the loop variable properly? */
/*public class UninitializedWhileLoop { 
 public static void main(String[] args) { 
 int count; 
 while (count < 10) { 
 System.out.println(count); 
 count++; 
 } 
 } 
} */
/* to print the count first we hvae to initialise count it does not check condition 
because we does not given it*/
public class UninitializedWhileLoop { 
 public static void main(String[] args) { 
 int count=0; 
 while (count < 10) { 
 System.out.println(count); 
 count++; 
 } 
 } 
}