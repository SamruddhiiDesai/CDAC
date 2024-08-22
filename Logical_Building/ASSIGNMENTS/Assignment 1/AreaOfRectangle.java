//AREA OF RECTANGLE

import java.util.Scanner;

class AreaOfRectangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

       
        int area = length * width;

       
        System.out.println("The area of the rectangle is: " + area);
    }
}
