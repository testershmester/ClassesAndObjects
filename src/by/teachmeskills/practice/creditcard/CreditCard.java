package by.teachmeskills.practice.creditcard;

public class CreditCard {

    private String accountNumber;
    private double currentSum;

    public CreditCard(String accountNumber) {
        this.accountNumber = accountNumber;
        this.currentSum = 0;
    }

    public void addSum(double sumToAdd) {
        this.currentSum = this.currentSum + sumToAdd;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(double currentSum) {
        this.currentSum = currentSum;
    }

    public String getInfo() {
        return "Account number is " + this.accountNumber;
    }

    @Override
    public String toString() {
        return "Account number is " + this.accountNumber;
    }
}
