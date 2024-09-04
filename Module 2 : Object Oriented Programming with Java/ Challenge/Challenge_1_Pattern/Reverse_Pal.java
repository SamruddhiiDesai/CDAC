import java.util.Scanner;

public class Reverse_Pal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        //int rows = 5;

        for (int i = 1; i <= 5; i++) {
           
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

           
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            
            System.out.println();
        }
        for(int i=5-1;i>0;i--)
            {
                  //declare inner loop for print the spaces
                  for(int j=1;j<=5-i;j++)
                  {
                         System.out.print(" ");
                  }
                  //declare inner loop for print the number
                  for(int j=1;j<=i*2-1;j++)
                  {
                         System.out.print(j);
                  }
                  System.out.println();
             }

    }
    
    
}
