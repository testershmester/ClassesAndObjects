package by.teachmeskills.practice.inheritance;

public class Employee extends Person {

    private String company;

    public Employee(String name, String surname, String company) {
        super(name, surname);
        this.company = company;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя: " + super.getName() + " Фамилия: " + super.getSurname() + " Компания: " + this.company);
    }
}
