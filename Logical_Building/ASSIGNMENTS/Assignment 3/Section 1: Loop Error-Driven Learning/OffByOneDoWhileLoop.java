/*// Error to investigate: Why does this loop print unexpected numbers? 
What adjustments are needed to print the numbers from 1 to 5? */
/*public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num--; 
 } while (num > 0); 
 } 
} */
 /*num=1-->then it print 1-->dec num---->num=0-->check while num>0--->0>0---->cond false
 loop termineted*/
 
 public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num <=5); 
 }
 }