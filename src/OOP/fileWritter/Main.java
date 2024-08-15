package OOP.fileWritter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Always wrap your FileWriter class in a trya catch block

        try {
            FileWriter writer = new FileWriter("C:\\Users\\ETIENNE G\\Desktop\\JavaProject\\src\\OOP\\fileWritter\\adress.txt");
            writer.write("My address \nEtienne Gwiavander \nBamenda Cameroon \nNorthwest Region");
            writer.append("\nMile3 Nkwen");
            writer.close(); // always close the filewriter when you are done with it

        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}
