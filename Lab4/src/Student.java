public class Student extends Person{

    private int yearOfStudy;
    private String programmeOfStudy;

    public Student(String n, String a, String pn, String e,String pOS, int yOS) {
        super(n, a, pn, e);
        this.yearOfStudy = yOS;
        this.programmeOfStudy =pOS;
    }

    public String toString() {
        return super.toString() + " Year Of Study:" + yearOfStudy + " Programme Of Study:" + programmeOfStudy;
    }

}
