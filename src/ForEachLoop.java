import java.util.ArrayList;

public class ForEachLoop {
    public static void main(){
        // for-each = enhanced forloop traversing technique to iterate through the elements in an array/collection
        //    pros:   less steps, more readable
        //    cons:   less flexible

        ArrayList<String> myFamily = new ArrayList<String>(); // collection

        myFamily.add("Etienne");
        myFamily.add("Fausta");
        myFamily.add("Nailah");
        myFamily.add("Asher");

        for(String i : myFamily){
            System.out.println(i);
        }



    }
}
