public class AlphabetPyramid_ABC {
    public static void main(String[] args) {
        int n = 5; 
        char firstChar = 'A'; 

        for (int i = 1; i <= n; i++) {
            
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(firstChar);
                firstChar++; 
                if (firstChar > 'Z') {
                    break; 
                }
            }

            System.out.println();

            
            if (firstChar > 'Z') {
                break;
            }
        }
    }
}
