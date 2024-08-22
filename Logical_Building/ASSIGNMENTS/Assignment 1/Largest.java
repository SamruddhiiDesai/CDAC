//LARGEST NUMBER

import java.util.Scanner;

class LargestNo{
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a number2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter a number3: ");
        int number3 = scanner.nextInt();

        if(number1 > number2){
                 if(number1>number3){
                    System.out.println("The number1 is Largest.");
                  }
                 else{
                      System.out.println("The number3 is Largest.");
                     }
                }else{
                   if (number2 > number3) {
                      System.out.println("The number2 is Largest.");
                        } 
         else  {
                      System.out.println("The number3 is Largest.");
               } 
    
           }
        
        scanner.close();
    }
}
