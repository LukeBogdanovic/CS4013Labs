public class SavingsAccount extends BankAccount{

    public SavingsAccount(int i, double b) {
        super(i, b);     
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
        if(getBalance() <= 0){
            setBalance(0);
        }
   }
    
   public String toString() {
       return super.toString();
   }

}
