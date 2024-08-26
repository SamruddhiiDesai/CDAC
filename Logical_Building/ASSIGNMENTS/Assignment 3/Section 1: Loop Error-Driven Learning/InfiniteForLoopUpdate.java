/*// Error to investigate: Why does the loop print unexpected results or run infinitely? 
How should the loop update expression be corrected? */
public class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i += 2) { 
 System.out.println(i); 
 } 
 } 
} 
/*output
0
2
4

i=0-->check condition 0<5 condition true--->print 0---->incement i=i+2 ie i=0+2=0
---->check condition 2<5 true--->print 2--->increment i=2+2=4---*/