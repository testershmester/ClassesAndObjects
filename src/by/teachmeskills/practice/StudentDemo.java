package by.teachmeskills.practice;

public class StudentDemo {
    public static void main(String[] args) {
        int studentsCount = 14;
        Student[] students = new Student[studentsCount];
        for (int i = 0; i < studentsCount; i++) {
            String name = "Student_" + (i + 1);
            students[i] = new Student(name);
        }
        printExcellentPupils(students);
    }

    public static void printExcellentPupils(Student[] students) {
        System.out.println("All excellent pupils:\n");
        for (Student student : students) {
            int studentMark = student.getMark();
            if (studentMark == 9 || studentMark == 10) {
                student.printStudentInfo();
            }
        }
    }
}
