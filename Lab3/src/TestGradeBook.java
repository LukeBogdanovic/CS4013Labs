package src;

public class TestGradeBook {

    public static void main(String[] args) {
		GradeBook book1 = new GradeBook("CS4013",2);
		GradeBook book2 = new GradeBook("CS4096",1);
		book1.addStudentResult("Mary", 0, 82);
		book1.addStudentResult("Mary", 1, 80);
		book1.addStudentResult("Jordan", 0, 67);
		book1.addStudentResult("Jordan", 1, 56);
		book2.addStudentResult("Ann", 0, 73);
		book2.addStudentResult("Sean", 0, 54);
		book2.addStudentResult("Jack", 0, 66);
		System.out.print(book1.toString());
		System.out.print(book2.toString());
    }
    
}
