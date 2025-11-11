package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student {

    private String name;
    private Map<Subject, List<Integer>> grades;

    public Student(String name, Map<Subject, List<Integer>> grades) {
        this.name = name;
        this.grades = new HashMap<>(grades);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Subject, List<Integer>> getGrades() {
        return grades;
    }

    public void setGrades(Map<Subject, List<Integer>> grades) {
        this.grades = grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grades);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
