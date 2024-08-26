//What compilation error do you see? Why does Java enforce type safety

/*public class Main7 { 
 public static void main(String[] args) { 
 int x = "Hello";
 
 System.out.println(x); 
 } 
} */

/* error: incompatible types: String cannot be converted to int
 int x = "Hello";
         ^
1 errors*/
/*
int store 4byte ie 32bit integer value but here given string char size is 2byte
 These data types have different sizes and purposes.
In Java, char values are typically represented using Unicode encoding, 
which assigns a numerical value to each character. However,
 this numerical value is not directly compatible with the range of values that
 an int can hold. 
*/
public class Main7 {
    public static void main(String[] args) {
        String x = "Hello";

        System.out.println(x);
    }
}