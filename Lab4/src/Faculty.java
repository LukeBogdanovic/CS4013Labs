public class Faculty extends Employee{

    private String officeHours;
    private String rank;

    public Faculty(String n, String a, String pn, String e, String o, double s,String oH,String r) {
        super(n, a, pn, e, o, s);
        this.officeHours = oH;
        this.rank = r;
    }
    
    public String toString() {
        return super.toString() + " Office Hours:" + officeHours + " Rank:" + rank;
    }

}
