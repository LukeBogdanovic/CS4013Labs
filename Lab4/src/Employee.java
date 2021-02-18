public class Employee extends Person{

    private String office;
    private double salary;

    public Employee(String n, String a, String pn, String e, String o, double s) {
        super(n, a, pn, e);
        this.office = o;
        this.salary = s;
    }
    
    public String toString() {
        return super.toString() + " Office:" + office + " Salary:" + salary;
    }

}
