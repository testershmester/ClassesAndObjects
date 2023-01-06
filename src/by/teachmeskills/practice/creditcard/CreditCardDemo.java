package by.teachmeskills.practice.creditcard;

public class CreditCardDemo {

    public static void main(String[] args) {
        CreditCard firstCreditCard = new CreditCard("15479154PB54875LO");
        CreditCard secondCreditCard = new CreditCard("15479154PB57875L1");
        CreditCard thirdCreditCard = new CreditCard("15474254PB54875L2");

        firstCreditCard.addSum(5);
        secondCreditCard.addSum(50);
        thirdCreditCard.addSum(500);

        System.out.println(firstCreditCard.getInfo());
    }
}
