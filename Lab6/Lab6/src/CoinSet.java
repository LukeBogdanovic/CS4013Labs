import java.util.ArrayList;

public class CoinSet {

    private ArrayList<Coin> set;

    public CoinSet() {
        set = new ArrayList<Coin>();
    }

    public ArrayList<Coin> getCoinSet() {
        return set;
    }

    public void addCoin(Coin c) {
        set.add(c);
    }

    public void addCoins(CoinSet c) {
        for (int i = 0; i < set.size(); i++) {
            c.add(set.get(i));
        }
    }

    public void removeCoinSet() {
        set.removeAll(set);
    }

    public double getValue() {
        double value = 0;
        for (int i = 0; i < set.size(); i++) {
            value = value + set.get(i).getValue();
        }
        return value;
    }

}
