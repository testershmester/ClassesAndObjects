package by.teachmeskills.accounting.document;

import java.util.Date;

/*
 Финансовая накладная. Содержит поля:
    Итоговая сумма за месяц
    Дата документа
    Номер документа
    Код департамента
 */
public class Invoice extends Document {

    private String departmentCode;
    private int finalMonthSum;

    public Invoice() {
    }

    public Invoice(String numberOfDocument, Date dateOfDocument, String departmentCode, int finalMonthSum) {
        super(numberOfDocument, dateOfDocument);
        this.departmentCode = departmentCode;
        this.finalMonthSum = finalMonthSum;
    }

    @Override
    public String getInfo() {
        return "Invoice № " + numberOfDocument + " of " + dateOfDocument + ". " +
                "Department: " + departmentCode + ". Total: " + finalMonthSum;
    }
}
