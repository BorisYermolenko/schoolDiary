package model;

import java.util.Objects;

public class Subject {

    private String subjectName;
    private String professorName;

    public Subject(String subjectName, String professorName) {
        this.subjectName = subjectName;
        this.professorName = professorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(subjectName, subject.subjectName) && Objects.equals(professorName, subject.professorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectName, professorName);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", professorName='" + professorName + '\'' +
                '}';
    }
}
