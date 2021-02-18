package lab5;
import java.time.LocalDateTime;

public class Transaction {
    
    private LocalDateTime date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char t, double a, double b, String d) {
        this.date = LocalDateTime.now();
        this.type = t;
        this.amount = a;
        this.balance = b;
        this.description = d;
    }

    public String toString(){
        return "Date of Transaction:" + date + " Type:" + type + " Amount:" + amount + " Balance:" + balance + " Description:" + description;
    }

}
