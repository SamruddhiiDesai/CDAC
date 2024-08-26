// What runtime exception do you encounter? Why does it occur?

public class Main11 { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 //System.out.println(arr[5]); 
 System.out.println(arr[2]); //op=3
 } 
} 
/*RUN TIME ERROR
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
 Index 5 out of bounds for length 3
        at Main11.main(Main11.java:6)*/
		
/* arr has initialize with three elements {123} there index are 0,1,2 but int the
 statement SOP arr has given index 5.It attempts to access element at index 5 which 
 does not exist in given array
*/