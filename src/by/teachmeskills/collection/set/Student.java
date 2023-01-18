package by.teachmeskills.collection.set;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private int course;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getCourse() == student.getCourse() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCourse());
    }

    @Override
    public int compareTo(Student student) {
        if (this.getCourse() != student.getCourse()) {
            return Integer.compare(this.course, student.course);
        } else if (this.equals(student)) {
            return 0;
        } else {
            return 1;
        }
    }
}
