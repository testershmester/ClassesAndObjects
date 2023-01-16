package by.teachmeskills.string.document;

/*
    На вход передать строку (будем считать, что это номер документа).
    Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
 */
public class DocNumberDemo {
    public static void main(String[] args) {
        String docNumber = "1234-abc-5678-def-g8h0";
        System.out.println("Исходная строка: \033[1;32m" + docNumber + "\033[0m");

        //Вывести на экран в одну строку два первых блока по 4 цифры.
        DocNumberUtils.printFirstTwoBlocks(docNumber);
        //Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
        DocNumberUtils.printThreeLettersBlocksAsStars(docNumber);
        //Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
        DocNumberUtils.printOnlyLetters(docNumber);
        //Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет
        // (причем, abc и ABC считается одинаковой последовательностью).
        DocNumberUtils.containsAbc(docNumber);

        DocNumberUtils.isWordPalindrome("andna", 0);
        DocNumberUtils.findWordWithMinOfDiffSymbols("fffff ab f 1234 jkjk");
    }
}
