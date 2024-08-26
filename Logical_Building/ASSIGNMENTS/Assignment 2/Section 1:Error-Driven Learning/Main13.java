//What exception is thrown? Why does it occur?

public class Main13 { 
 public static void main(String[] args) { 
 //String str = null; 
 String str ="Name";
 System.out.println(str.length()); 
 } 
} 
/* Throw exception at run timeException in thread "main" 
java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" 
is null
at Main13.main(Main13.java:6)
NullPointerException is thrown when you try to perform an operation on an object 
that hasn't been initialized (i.e., it's null).
Since str is null, there is no actual String object in memory on which the length()
 method can be invoked.
Java's runtime system cannot call methods on null references, so it throws a 
NullPointerException to indicate that the method call is invalid.*/