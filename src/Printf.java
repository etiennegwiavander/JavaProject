public class Printf {
    public static void main(String[] args){
        // printf() = an optional method to control, format, and display text to the console windows
                    //two arguments = fomat string + (object/variable/value)
                    //% [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '#';
        String myString = "Etienne";
        int myInt = 1234;
        double myDouble = 5500;

        // [conversion-character]
        System.out.printf("%b", myBoolean);
        System.out.println();
        System.out.printf("%c", myChar);
        System.out.println();
        System.out.printf("%s", myString);
        System.out.println();
        System.out.printf("%d", myInt);
        System.out.println();
        System.out.printf("%f", myDouble);
        System.out.println();

        // [width]
        // minimum number of characters to be written as output

        System.out.printf("Hello %14s", myString); // this aligns to the right leaving the xtra space on left
        System.out.println();
        System.out.printf("Hello %-14s", myString);// this aligns to the left leaving the xtra space on right
        System.out.println();

        //[Precision]
        //sets number of digits of pricision when ouputting floating-pint values
        System.out.printf("Your Balance is: %.2f XAF ", myDouble);
        System.out.println();

        //[flags]

        // flags - Optional. A sequence of any of the following characters:
        // - - Makes the output left-justified by adding any padding spaces to the right instead of to the left.
        // + - Causes positive numbers to always be prefixed with "+".
        // - (A space character) This prefixes a space to positive numbers, primarily so that the digits can be lined up with the digits of negative numbers.
        // 0 - Pads numbers with zeroes on the left.
        // , - Groups digits (for example by thousands) and puts separators between the groups.


    }
}
