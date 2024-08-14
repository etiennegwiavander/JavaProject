package OOP.fileClass;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // file = an abstract representation of file and directory pathnames
        
        File file = new File("C:/Users/ETIENNE G/Desktop/JavaProject/src/OOP/fileClass/test.txt");

        if(file.exists()){
            System.out.println("The file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        }else{
          System.out.println("File does not exist!");  
        }
    }
    
}
