package OOP.copyObjects;

public class Phone {
    private String name;
    private String model;
    private int year;

    Phone(String name, String model, int year){
        setName( name);
        setModel(model);;
        setYear(year);;
    }
    // Getters
    public String getName(){
        return name;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    // Setters

    public void setName(String name){
        this.name = name;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

    
    public void copy(Phone copiedAttr){
        this.setName(copiedAttr.getName());
        this.setModel(copiedAttr.getModel());
        this.setYear(copiedAttr.getYear());

    }

}
