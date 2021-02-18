public class CurrentAccount extends BankAccount {

    private double overDraft;

    public CurrentAccount(int i, double b, double oD) {
        super(i, b);
        this.overDraft = oD;
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
        if(getBalance() > (getBalance() - overDraft)) {
            setBalance(0 - overDraft);
        }
    }

    public String toString() {
        return super.toString() + " OverDraft Limit:" + overDraft;
    }
    
}
