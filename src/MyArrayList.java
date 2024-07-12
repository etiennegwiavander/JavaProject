import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] arg){
        // ArrayList = a resizable array 
        //             Elements can be added and removed after compilation phase
        //             Store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("fufu corn");
        food.add("rice and stew");
        food.add("salad");
        food.add("pap and puff-puff");

        // Methods of ArrayList

        food.set(0, null); // this method replaces an element at a particular index
        food.remove(2); // This method removes an element at a particular index
        food.clear(); // This method clears the entire ArrayList


        for(int i=0; i<food.size(); i++){ // we use .size() instead of the .length method when working with ArrayList
            System.out.println(food.get(i)); // To display, here we use .get(i) method instead of [] because it's a list
            // System.out.println(food);
        }
    }
}
