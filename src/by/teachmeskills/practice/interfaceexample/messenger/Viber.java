package by.teachmeskills.practice.interfaceexample.messenger;

public class Viber implements Messenger {

    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Viber");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Получаем сообщение в Viber");
    }
}
