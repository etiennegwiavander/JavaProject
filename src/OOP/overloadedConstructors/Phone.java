package OOP.overloadedConstructors;

public class Phone {
    
    String company;
    String model;
    int ram;
    String OS;

    
    Phone(String company, String model, String OS, int ram){
        this.company = company;
        this.model = model;
        this.OS = OS;
        this.ram = ram;
    }
}
