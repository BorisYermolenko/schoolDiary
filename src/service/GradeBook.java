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
        double averageGrade = 0;
        for (Student st : students) {
            if (st.equals(student)) {
                for (Map.Entry<Subject, List<Integer>> entry : student.getGrades().entrySet()) {
                    for (int i : entry.getValue()) {
                        averageGrade += i;
                    }
                }
                break;
            }
        }
        return averageGrade;

//        for (List<Integer> list : student.getGrades().values())
    }

    public double getAverageGradeSubject(Student student, Subject subject) {
        double averageGrade = 0;
        for (Student st : students) {
            if (st.equals(student)) {

            }
        }

        return averageGrade;
    }
}
