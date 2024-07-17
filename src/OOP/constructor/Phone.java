package OOP.constructor;

public class Phone {
    String model;
    int year;
    String OS;
    double version;

    Phone(String model, int year, String OS, double version){

        this.model = model;
        this.year = year;
        this.OS = OS;
        this.version = version;
  
    }

    void review(){
        System.out.println("This " +this.model+ " has:");
        System.out.println("Year of Manufacture: " + this.year);
        System.out.println("Operating System: " + this.OS);
        System.out.println("Running on android version: " + this.version);
    }
}
