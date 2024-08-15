package OOP.fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        // FileReader = read the contents of a file as a stream of characters. one by one
        //              read() returns an int value which contains the byte value
        //              When read() returns -1, there is no more data to be read
        //              To read the actual content, we need to convert these ASCII values back to characters.
        
        try (FileReader reader = new FileReader("C:\\Users\\ETIENNE G\\Desktop\\JavaProject\\src\\OOP\\fileReader\\test.txt")) {
            int data;
            while ((data = reader.read()) != -1) {
                char c = (char) data;
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// public class Main {
//     public static void main(String[] args) {
        // FileReader = read the contents of a file as a stream of characters. one by one
        //              read() returns an int value which contains the byte value
        //              When read() returns -1, there is no more data to be read

//         try {
//             FileReader reader = new FileReader("C:\\Users\\ETIENNE G\\Desktop\\JavaProject\\src\\OOP\\fileReader\\test.txt");
//             int data = reader.read();
//             while (data != -1) {
//                 System.out.print((int)data);
//                 data = reader.read();
//             }
//             reader.close();
//         }catch (FileNotFoundException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         } catch (IOException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
        
//         } 
//     }
// }