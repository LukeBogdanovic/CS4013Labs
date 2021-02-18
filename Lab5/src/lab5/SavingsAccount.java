package lab5;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int i, double b) {
        super(i, b);     
    }

    public SavingsAccount(String n,int i,double b){
        super(n, i, b);
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
        if(getBalance() <= 0){
            setBalance(0);
        }
        transactions.add(new Transaction('W', amount, getBalance(), "Withdrawl of:" + amount));
   }
    
   public String toString() {
       String result = "";
       for (int i = 0; i < transactions.size(); i++) {
            result = super.toString() + "\n" + transactions.get(i);
       }
       return result;
   }

}
