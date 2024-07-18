package OOP.toStringMethod;

public class Phone {
    String company = "Samsung";
    String model = "6a";
    int ram = 12;
    String OS = "Android";

    public String toString(){
        return company +"\n"+model+"\n"+ram+"\n"+OS;
    }
}
