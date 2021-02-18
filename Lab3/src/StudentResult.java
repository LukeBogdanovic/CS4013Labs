package src;

public class StudentResult {
    
    private String studentId;
    private TestResult testResult;

    public StudentResult(String sid){
        this.studentId = sid;
    }

    public StudentResult(String sid, int nofT){
        this.studentId = sid;
        this.testResult = new TestResult(nofT);
    }

    public String getStudentId() {
        return studentId;
    }

    public void addResult(int testId, double value) {
        testResult.setScore(testId, value);
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < testResult.scores.length; i++) {
            result = result + " " + testResult.getScore(i);
        }
        return getStudentId() + " " + result + " " + testResult.getGrade() + "\n";
    }

}
