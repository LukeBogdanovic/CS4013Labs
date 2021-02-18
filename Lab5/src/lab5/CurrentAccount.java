package lab5;

public class CurrentAccount extends BankAccount {

    private double overDraft;

    public CurrentAccount(int i, double b, double oD) {
        super(i, b);
        this.overDraft = oD;
    }
    public CurrentAccount(String n,int i, double b, double oD){
        super(n,i,b);
        this.overDraft = oD;
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
        if(getBalance() > (getBalance() - overDraft)) {
            setBalance(0 - overDraft);
        }
        transactions.add(new Transaction('W', amount, getBalance(), "Withdrawl of:" + amount));
    }

    public String toString() {
        String result = "";
        for(int i = 0; i < transactions.size();i++) {
            result = super.toString() + " OverDraft Limit:" + overDraft + "\n" + transactions.get(i);
        }
        return result;
    }
    
}
