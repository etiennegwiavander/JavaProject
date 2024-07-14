
public class Methods {
    public static void main(String[] args) {
        // Method is a block of code that is executed whenever it is called upon
        // A block of code within a class
        // Associated with an object
        // Can be public, private, protected
        // Can be inherited by subclasses
        // When a variable is returned it becomes a local variable and can be declared twice.

        int a = 7;
        int b = 6;
        String promt = "The sum of " + a + " and " +  b  + " is: ";
        sum(promt ,a, b); 

        // Displaying the output produced by the return keyword
        String dis = "The product of the sum of " + a + " and " +  b  + " is: ";

        int y = sum(dis, a, b);
        System.out.println(y);
        
    }

    static int sum(String promt, int a, int b){
       int z = a + b;
       System.out.println( promt + z);

       // introducing the return statement and removing the "void" and replacing it with the data type int during the method declaration

       int y = z * (a + b);
       return y;

    }
}
