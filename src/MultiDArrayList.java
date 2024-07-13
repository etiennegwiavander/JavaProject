import java.util.*;

public class MultiDArrayList {
    public static void main(String[] arg){

        ArrayList<ArrayList<String>> Families = new ArrayList(); // This 2D ArrayList initiallation brings together all the arraylists created below

        ArrayList<String> MyFamily = new ArrayList();

        MyFamily.add("Etienne");
        MyFamily.add("Fausta");
        MyFamily.add("Nailah");
        MyFamily.add("Asher");

        ArrayList<String> JoseFamily = new ArrayList();

        JoseFamily.add("Jose");
        JoseFamily.add("Gloria");
        JoseFamily.add("Ethna");
        JoseFamily.add("Eliora");
        JoseFamily.add("Eliana");

        ArrayList<String> ArmyFamily = new ArrayList();

        ArmyFamily.add("Armstrong");
        ArmyFamily.add("Feli");
        ArmyFamily.add("Keren");
        ArmyFamily.add("Love");
        

        // Lets add all the ArrayLists created above to the main (Families) ArrayList

        Families.add(MyFamily);
        Families.add(JoseFamily);
        Families.add(ArmyFamily);

        System.out.println("Option 1: " + Families );

        System.out.println(Families.get(0).get(0));

        // Option two on how to print out the elements of the 2D ArrayList in a more readable way

        for (int i = 0; i < Families.size(); i++) {
            System.out.println("Family " + (i + 1) + ": " + Families.get(i));
          }
    }
}
