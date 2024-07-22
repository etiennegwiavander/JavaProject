package OOP.superKeyWord;

public class Pixel extends Phone{
    String powers;

    Pixel(String name, int year, String powers){
        super(name, year);        
        this.powers = powers;
    }

    public  String toString(){
        return super.toString()+this.powers;
    }
}
