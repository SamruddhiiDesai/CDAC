import java.util.Scanner;

public class PalindromePyramid {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
           
            for (int j = 1; j <= rows - i; j++) {
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
    }
    
}
