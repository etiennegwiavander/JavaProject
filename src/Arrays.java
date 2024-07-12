public class Arrays {
    public static void main(String[] args){
        // Array = used to store multiple values in a single variable
        // Arrays have strict data types 

        //Method 1
        String[] members = {"Etienne", "Fausta", "Nailah", "Asher"};

        for(int i = 0; i <= members.length; i++){
            System.out.println("Method1" + members[i]);
        }

        //Method 2
        String[] family = new String[4];
        family[0] = "Etienne";
        family[1] = "Fausta";
        family[2] = "Nailah";
        family[3] = "Asher";

        for(int i = 0; i < family.length ; i++){
            
            System.out.println(family[i]);
        
        }
    }
}
