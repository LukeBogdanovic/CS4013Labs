package src;

import java.util.*;

public class GradeBook {

    private String name;
    private int nOfTests;
    private ArrayList<StudentResult> results = new ArrayList<StudentResult>();

    public GradeBook(String name, int NofTests) {
        this.name = name;
        this.nOfTests = NofTests;
    }

    public void addStudentResult(String id, int testId, double value) {
        boolean found = false;
        for (StudentResult result : results) {
            if (id == result.getStudentId()) {
                found = true;
                result.addResult(testId, value);
                break;
            }
        }
        if (!found) {
            StudentResult result = new StudentResult(id, nOfTests);
            results.add(result);
            result.addResult(testId, value);
        }
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < results.size(); i++) {
            result = result + results.get(i);
        }
        return name + "\n" + result + "\n";
    }

}
