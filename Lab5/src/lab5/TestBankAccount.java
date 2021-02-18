package lab5;
import java.util.*;

public class TestBankAccount {
    
    private static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    public static void main(String[] args) {
        CurrentAccount account1 = new CurrentAccount("Mary",19232691, 8563.67, 1000);
        SavingsAccount account2 = new SavingsAccount("John",19232789, 6574.03);
        
        accounts.add(account1);
        accounts.add(account2);
        
        for(BankAccount account : accounts){
            account.setAIR(0.07);
            account.withdraw(1000);
        }
        System.out.println(account1 + "\n");
        System.out.println(account2 + "\n");
        for(BankAccount account :accounts){
            account.deposit(500);
        }
        System.out.println(account1 + "\n");
        System.out.println(account2 + "\n");

    }

}
