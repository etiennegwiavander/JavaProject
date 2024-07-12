public class duplicate {
    public static void main(String[] args){
        String x = "Water";
        String y = "Ice-Max";
        String e;

        e = x;
        x = y;
        y = e;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
    
}
