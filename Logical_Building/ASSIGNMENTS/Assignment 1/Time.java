//GOOD MORNING

import java.util.Scanner;

class Time{
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a time: ");
        int time = scanner.nextInt();

        
        if (time>= 5 && time<=12) {
            System.out.println("!!!!GOOD MORNING!!!!");
        } 
         else  {
            System.out.println("Nooo");
        } 

        scanner.close();
    }
}
