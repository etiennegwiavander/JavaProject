package OOP.polymorphysm;

public class Main {
    public static void main(String[] args) {
        // polymorphism = greek word for poly - "many", and morph -" forms"
        //                the ability of an object to identify as more than one type

        Budget budget = new Budget();
        Flagship flagship = new Flagship();
        MidRange midRange = new MidRange();

        Phone[] store = {budget, flagship, midRange}; // the Phone in this line of code represents the data type because that's what all of them have in common

        // to display all the phones in the store, use the enhanced for loop to do so.
        for(Phone x : store){ // the Phone is the data type, x = counter and the name of the array which is store
            x.has();
            
        }


    }
}
