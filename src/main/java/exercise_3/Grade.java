package exercise_3;

public class Grade {
    private int numStudent;
    private double grade;

    public Grade(int numStudent, double grade){
        this.numStudent = numStudent;
        this.grade = grade;
    }

    /**
     * This method returns student's number
     * @return student's number
     */
    public int getNumStudent(){
        return this.numStudent;
    }

    /**
     * This method returns student's grade
     * @return student's grade
     */
    public double getGrade(){
        return this.grade;
    }
}
