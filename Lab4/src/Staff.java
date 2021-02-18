public class Staff extends Employee {
    
    private String title;

    public Staff(String n, String a, String pn, String e, String o, double s, String t) {
        super(n, a, pn, e, o, s);
        this.title = t;
    }

    public String toString() {
        return super.toString() + " Title:" + title;
    }

}
