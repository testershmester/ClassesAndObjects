package by.teachmeskills.practice.inheritance;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", "Ivanov", "Teachmeskills");
        employee.displayInfo();

        Person person = new Person("Ivan", "Ivanov");
        person.displayInfo();

    }
}
