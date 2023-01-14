package by.teachmeskills.accounting;

import by.teachmeskills.accounting.document.Document;
import by.teachmeskills.accounting.document.EmploymentContract;
import by.teachmeskills.accounting.document.Invoice;
import by.teachmeskills.accounting.document.SupplyContract;

import java.util.Calendar;
import java.util.Date;

/*
Для имитации работы системы создайте класс Main, который будет содержать только один метод public static void main.
В этом методе напишите код для создания каждого из типов документов,
добавления их в регистр и вывода информации о документе
 */
public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime(); // текущая дата
        calendar.add(Calendar.YEAR, 1);
        Date nextYear = calendar.getTime(); // следующий год

        Document employmentContract = new EmploymentContract("1", today, "Peter Parker", nextYear);
        Document supplyContract = new SupplyContract("2", today, "Car", 5);
        Document invoice = new Invoice("3", today, "52357-A", 5000);

        Register register = new Register();
        register.saveDocument(employmentContract);
        register.saveDocument(supplyContract);
        register.saveDocument(invoice);

        register.getDocumentInfo(employmentContract.getNumberOfDocument());
        register.getDocumentInfo(supplyContract.getNumberOfDocument());
        register.getDocumentInfo(invoice.getNumberOfDocument());
    }
}
