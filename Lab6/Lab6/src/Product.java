public class Product {

    private String description;
    private double price;

    public Product(String aDescription,double aPrice){
        description = aDescription;
        price = aPrice;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public boolean equal(Product p){
        if(p.equals(null)){
            return false;
        }
        if(p.getDescription().equals(description) && p.getPrice() == price){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Description:" + description + " Price:" +"$" + price;
    }

}
