public class OverLoadedMethods {

    public static void main(String[] args) {
        // overloaded methods = methods that share the same name but have different parameters
        //                     same methods name + same parameters = method signature 
        // what this means is you can maitain the method name while changing the parameters. when called the method with the exact number of parameters will be called

        double z = product(5, 4);
        
        System.out.println(z);
        
        
    }

    static int product( int a, int b ){
        System.out.println(" This is oberloaded method #1 ");
        return a * b;
    }
    static double product( double a, double b ){
        System.out.println(" This is oberloaded method #1 ");
        return a * b;
    }
    static int product( int a, int b, int c ){
        System.out.println(" This is oberloaded method #2 ");
        return a * b * c;
    }
    static int product( int a, int b, int c, int d  ){
        System.out.println(" This is oberloaded method #3 ");
        return a * b * c * d;
    }
    static int product( int a, int b, int c, int d, int e ){
        System.out.println(" This is oberloaded method #4 ");
        return a * b * c * d * e;
    }
    


}
