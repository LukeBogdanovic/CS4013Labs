import java.util.*;

public class TestBankAccount {
    
    private static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    public static void main(String[] args) {
        CurrentAccount account1 = new CurrentAccount(19232691, 8563.67, 1000);
        CurrentAccount account2 = new CurrentAccount(19232789, 6574.03, 500);
        SavingsAccount account3 = new SavingsAccount(19232697, 23607.65);
        SavingsAccount account4 = new SavingsAccount(19232589, 47634.09);
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        for(BankAccount account: accounts) {
            account.setAIR(0.07);
            System.out.println("\n"+account);
            account.withdraw(1000);
            System.out.println("\n" + account);
            account.deposit(3000);
            System.out.println("\n" + account);
            account.withdraw(50000);
            System.out.println("\n" + account);
        }
    
    }

}
