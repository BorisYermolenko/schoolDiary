package service;

import model.Student;
import model.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GradeBook {

    private List<Student> students;

    public GradeBook(List<Student> students) {
        this.students = new ArrayList<>(students);
    }

    public void addGrade(Student student, Subject subject, int grade) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(student)) {
                students.get(i).getGrades().get(subject).add(grade);
            }
        }
    }

    public double getAverageGradePerStudent(Student student) {
        double result = 0;
        for (Student st : students) {
            if (st.equals(student)) {
                for (List<Integer> subjects : st.getGrades().values()) {
                    double sum = 0;
                    for (int grade : subjects) {
                        sum += grade;
                    }
                    result += sum / subjects.size();
                }
                result = result / st.getGrades().size();
                break;
            }
        }
        return result ;
    }

    public double getAverageGradeSubject(Student student, Subject subject) {
        double result = 0;
        for (Student st : students) {
            if (st.equals(student)) {
                for (int grade : st.getGrades().get(subject)) {
                    result += grade;
                }
                result /= st.getGrades().get(subject).size();
                break;
            }
        }
        return result;
    }
}
