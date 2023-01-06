package by.teachmeskills.practice.interfaceexample.messenger;

public class ClientDemo {

    public static void main(String[] args) {
        Client firstClient = new Client(new Telegram());
        Client secondClient = new Client(new WhatsApp());


        Smartphone smartphone = new Smartphone(new WhatsApp());
    }
}
