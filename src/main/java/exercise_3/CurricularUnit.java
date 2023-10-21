package exercise_3;

import java.util.List;

public class CurricularUnit {
    private Grade[]grades;
    private String nameCU;
    private int totalStudents;
    private int grade_position = 0;

    /**
     * Constructor
     * @param nameCU curricular unit's name
     * @param totalStudents total student allowed to be in the curricular unit
     */
    public CurricularUnit(String nameCU, int totalStudents){
        this.nameCU = nameCU;
        this.grades = new Grade[totalStudents];
        this.totalStudents = totalStudents;
    }

    /**
     * This method search a student by its student's number
     * @param numStudent student's number to search
     * @return -1 if the student is not found; respective grade if the student is found
     */
    public double searchStudent(int numStudent){
        int i = 0;
        while(i < grades.length && numStudent != grades[i].getNumStudent()){
            i++;
        }
        if(i == grades.length || numStudent != grades[i].getNumStudent()){
            return -1;
        }
        return grades[i].getGrade();
    }

    /**
     * This method calculates the average between curricular unit's grades
     * @return curricular unit's average grade
     */
    public double averageCU(){
        double sum = 0;
        for(int i = 0; i < grades.length; i++){
            sum += grades[i].getGrade();
        }
        return sum / grades.length;
    }

    /**
     * This method checks if a student passed the curricular unit
     * @param numStudent student's number to check
     * @return true if student passes; false if student fails
     */
    public boolean isApproved(int numStudent){
        double grade = searchStudent(numStudent);
        //check if the student exists and value is higher than 9.5
        return grade != -1 && grade >= 9.5;
    }

    /**
     * This method inserts a grade into curricular unit's grades list
     * @param numStudent student's number
     * @param grade student's grade
     */
    public void insertGradeCU(int numStudent, double grade){
        Grade mark = new Grade(numStudent, grade);
        this.grades[grade_position] = mark;
        grade_position++;
    }

    public Grade[] getGrades(){
        return this.grades;
    }
}
