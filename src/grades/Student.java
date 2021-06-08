package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades; // = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        int count = 0;
        for (int grade : this.grades){
            count++;
            sum = (double) grade + sum;
        }
        double result = sum / count;
        return result;
    }


    public static void main(String[] args) {
        Student newStudent = new Student("Alex");
        newStudent.addGrade(100);
        newStudent.addGrade(50);
        System.out.println(newStudent.grades);
        System.out.println(newStudent.getGradeAverage());

    }




}
