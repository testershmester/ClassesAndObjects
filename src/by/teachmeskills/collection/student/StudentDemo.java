package by.teachmeskills.collection.student;

import java.util.*;

/*
    Напишите класс Student, предоставляющий информацию об имени студента методом getName()
    и о его курсе методом getCourse().
    Напишите метод printStudents(List students, int course), который получает список студентов
    и номер курса и печатает в консоль имена тех студентов из списка,
    которые обучаются на данном курсе. Для обхода списка в этом методе используйте итератор.
    Протестируйте ваш метод (для этого предварительно придется создать десяток объектов класса Student
    и поместить их в список).
 */
public class StudentDemo {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String name = "Student " + (i + 1);
            Student student = new Student(name);
            student.setCourse(random.nextInt(5) + 1);
            students.add(student);
        }
        System.out.println(students);
        int course = 3;
        printStudents(students, course);
    }

    public static void printStudents(List<Student> students, int course) {
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println("Студент \"" + student.getName() + "\" обучается на курсе " + course);
                iterator.remove();
            }
        }
        students.forEach(s -> System.out.println(s.getName() + "\n"));
//
//        students.forEach(s -> System.out.println(s.getName()));
//
//        List<Student> thirdCourseStudents = students.stream()
//                                                    .filter(s -> s.getCourse() == course)
//                                                    .collect(Collectors.toList());

    }
}
