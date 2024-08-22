//AREA OF SQURE

import java.util.Scanner;

class AreaOfSqure{
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a side: ");
        int side = scanner.nextInt();

       
        
            System.out.println("The Area is:"+side*side);
       
            
        

        scanner.close();
    }
}
