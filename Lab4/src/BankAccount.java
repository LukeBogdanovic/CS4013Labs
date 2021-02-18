import java.time.LocalDate;
import java.text.DecimalFormat;

public class BankAccount {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated;
    private DecimalFormat df = new DecimalFormat("0.00");

    public BankAccount(int i,double b) {
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

    public LocalDate getDate() {
        dateCreated = LocalDate.now();
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (getAIR()/12);
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public String toString() {
        return "Date Created:" + getDate() + " ID:" + id + " Balance:" + df.format(balance);
    }

}
