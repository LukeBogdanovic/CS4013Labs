package lab5;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class BankAccount {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDateTime dateCreated;
    private String name;
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    private DecimalFormat df = new DecimalFormat("0.00");

    public BankAccount(int i,double b) {
        this.id = i;
        this.balance = b;
    }

    public BankAccount(String n,int i,double b){
        this.name = n;
        this.id = i;
        this.balance = b;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public double getAIR() {
        return annualInterestRate;
    }

    public void setAIR(double a) {
        annualInterestRate = a;
    }

    public LocalDateTime getDate() {
        dateCreated = LocalDateTime.now();
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (getAIR()/12);
    }

    public void withdraw(double amount) {
        balance = getBalance() - amount;
        transactions.add(new Transaction('W',amount,getBalance(),"Withdrawl of:" + amount));
    }

    public void deposit(double amount) {
        balance = getBalance() + amount;
        transactions.add(new Transaction('D', amount, getBalance(), "Deposit of:" + amount));
    }

    public String toString() {
        return "Name:" + name + " Date Created:" + getDate() + " ID:" + id + " Balance:" + df.format(balance);
    }

}
