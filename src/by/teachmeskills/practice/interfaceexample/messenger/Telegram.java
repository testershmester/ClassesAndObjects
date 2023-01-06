package by.teachmeskills.practice.interfaceexample.messenger;

public class Telegram implements Messenger, Application {

    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Telegram");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Получаем сообщение в Telegram");
    }

    @Override
    public void launch() {
        System.out.println("Запускаем Telegram");
    }
}
