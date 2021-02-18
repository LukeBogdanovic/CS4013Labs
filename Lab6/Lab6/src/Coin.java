public class Coin {

    private double value;
    private String Name;
    
    public Coin(double aValue, String aName){
        value = aValue;
        Name = aName;
    }

    public double getValue(){
        return value;
    }
    
    public void setValue(double v){
        value = v;
    }

    public String getName(){
        return Name;
    }

    public void setName(String n){
        Name = n;
    }

    public String toString(){
        return "Value:" + value + " Name:" + Name;
    }

}
