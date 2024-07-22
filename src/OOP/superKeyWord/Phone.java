package OOP.superKeyWord;

public class Phone {
    String name;
    int year;
    
    Phone(String name, int year){
        
        this.name = name;
        this.year = year;        
    }
    public String toString(){
        return this.name + "\n" + this.year + "\n";
    }
}
