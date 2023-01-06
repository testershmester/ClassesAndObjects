package by.teachmeskills.practice.interfaceexample.messenger;

public class WhatsApp implements Messenger, Application {

    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в WhatsApp");

    }

    @Override
    public void receiveMessage() {
        System.out.println("Получаем сообщение в WhatsApp");
    }

    @Override
    public void launch() {
        System.out.println("Запускаем WhatsApp");
    }
}
