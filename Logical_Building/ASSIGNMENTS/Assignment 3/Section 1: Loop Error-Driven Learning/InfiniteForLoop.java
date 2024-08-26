/*// Error to investigate: Why does this loop run infinitely? 
How should the loop control variable be adjusted? */

public class InfiniteForLoop { 
 public static void main(String[] args) { 
 //for (int i = 0; i < 10; i--)
	for (int i = 0; i < 10; i++) { //print 0 to 9
 System.out.println(i); 
 } 
 } 
} 
/*infinite loop i=0 0<10 yes->print 0->i--->i=-1 and so on infinite*/