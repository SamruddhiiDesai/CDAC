/*// Error to investigate: What is the issue with the loop boundaries?
 How should the loop be adjusted to meet the expected output?*/

public class OffByOneErrorForLoop { 
 public static void main(String[] args) { 
 //for (int i = 1; i <10; i++) 
 for (int i = 1; i <= 10; i++){ 
 System.out.println(i); 
 } 
 // Expected: 10 iterations with numbers 1 to 10 
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
 } 
} 
/*in condition there given i=1;i<=10  so i start whith 1 then print 1
print 1->inci++=2->check condition i<=0 true->print 2..so on a 9th iteraton it i=10 then 
check condition 10<=10 true ->execute print 10 then exit
=>To meet modify condition i<10*/
