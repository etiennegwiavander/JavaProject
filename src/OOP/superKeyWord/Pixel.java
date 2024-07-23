package OOP.superKeyWord;

public class Pixel extends Phone{
    String chipset;

    Pixel(String name, int year, String chipset){
        super(name, year);        
        this.chipset = chipset;
    }

    public  String toString(){
        return super.toString() + this.chipset;
    }
}
