import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Product> products;
    public CoinSet coins;
    public CoinSet currentCoins;

    public VendingMachine(){
        products = new ArrayList<Product>();
        coins = new CoinSet();
        currentCoins = new CoinSet();
    }

    public void addCoin(Coin c){
        currentCoins.addCoin(c);
    }

    public Object[] getProductTypes() {
        return products.toArray();
    }

    public double removeMoney() {
        double result = currentCoins.getValue();
        currentCoins.removeCoinSet();
        return result;
    }

    public void addProduct(Product p, int i){
        for(int j = 0;j < i;j++){
            products.add(p);
        }
    }

    public void buyProduct(Product p){
        for(int i = 0; i < products.size();i++){
            Product pr = products.get(i);
            if(pr.equals(p)){
                double payment = currentCoins.getValue();
                if(p.getPrice() <= payment){
                    products.remove(i);
                    coins.addCoins(currentCoins);
                    currentCoins.removeCoinSet();
                    return;
                }else{
                    throw new VendingException("Insufficient funds");
                }
            }
        }
        throw new VendingException("No such product");
    }

}
