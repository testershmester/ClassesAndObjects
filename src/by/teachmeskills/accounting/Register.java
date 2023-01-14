package by.teachmeskills.accounting;

import by.teachmeskills.accounting.document.Document;

/*
    Создать класс Регистр, который будет иметь методы:
    - сохранения документа в регистре
    - предоставление информации о документе
 */
public class Register {
    /*
    Массив для класса регистра должен быть размером 10
     */
    private static final int REGISTER_SIZE = 10;

    private int docsInRegister;
    /*
    Класс регистр должен содержать внутри себя массив и при добавлении
    документа в регистр этот добавляемый документ должен добавляться в массив
     */
    private Document[] register;

    public Register() {
        this.register = new Document[REGISTER_SIZE];
    }

    public void saveDocument(Document document) {
        if (docsInRegister < REGISTER_SIZE) {
            register[docsInRegister] = document;
            docsInRegister++;
        } else {
            System.out.println("Register is full");
        }
    }

    /*
    В методе предоставления информации о документе следует выводить на экран
    информацию о переданном входным параметром документе
     */
    public void getDocumentInfo(String documentNumber) {
        for (Document document : register) {
            if (documentNumber.equals(document.getNumberOfDocument())) {
                System.out.println(document.getInfo());
                return;
            }
        }
        System.out.println("Document was not found!");
    }
}