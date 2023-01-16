package by.teachmeskills.string.document;

public class DocNumberUtils {

    public static final String EMPTY = "";

    public static void printFirstTwoBlocks(String docNumber) {
        String[] blocks = docNumber.split("-");
        System.out.println("Два первых блока: " + blocks[0] + blocks[1]);
    }

    public static void printThreeLettersBlocksAsStarsRegex(String docNumber) {
        String s = docNumber.replaceAll("\\[a-zA-Z]{3}", "*");
        System.out.println("Блоки из трёх букв заменить на ***: " + s);
    }

    public static void printOnlyLettersRegex(String docNumber) {
        String s = docNumber.replaceAll("\\d{4}-|\\d", EMPTY);
        s = s.replaceAll("-", "/");
        s = new StringBuilder(s).insert(s.length() - 1, "/").toString();
        System.out.println("Только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре: " +
                                   s.toLowerCase());
    }

    public static void printThreeLettersBlocksAsStars(String docNumber) {
        final String STARS = "***";
        String[] blocks = docNumber.split("-");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < blocks.length; i++) {
            if (i == 1 || i == 3) {
                sb.append(STARS);
            } else {
                sb.append(blocks[i]);
            }
            sb.append("-");
        }
        sb.deleteCharAt(sb.lastIndexOf("-"));
        System.out.println("Блоки из трёх букв заменить на ***: " + sb);
    }

    public static void printOnlyLetters(String docNumber) {
        String[] blocks = docNumber.split("-");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < blocks.length; i++) {
            if (i == 1 || i == 3) {
                sb.append(blocks[i])
                  .append("/");
            }

        }
        char[] chars = blocks[4].toCharArray();
        for (char symbol : chars) {
            if (Character.isLetter(symbol)) {
                sb.append(symbol).append("/");
            }
        }
        sb.deleteCharAt(sb.lastIndexOf("/"));
        System.out.println("Только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре: " +
                                   sb.toString().toLowerCase());
    }

    public static boolean containsAbc(String docNumber) {
        if (docNumber.toLowerCase().contains("abc")) {
            System.out.println("Number contains \"abc\"");
            return true;
        } else {
            System.out.println("Number doesn't contain \"abc\"");
            return false;
        }
    }

    /*3. Дана строка произвольной длины с произвольными словами.
    Найти слово, в котором число различных символов минимально. Слово
    может содержать буквы и цифры.
    Если таких слов несколько, найти первое из них.
    Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".*/
    public static String findWordWithMinOfDiffSymbols(String string) {
        System.out.println("Исходная строка: " + string);
        String[] words = string.split(" ");
        int[] uniqueSymbolsCount = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            StringBuilder buffer = new StringBuilder();
            char[] chars = words[i].toCharArray();
            for (char symbol : chars) {
                if (!buffer.toString().contains(String.valueOf(symbol))) {
                    buffer.append(symbol);
                }
            }
            uniqueSymbolsCount[i] = buffer.toString().length();
        }
        int min = uniqueSymbolsCount[0];
        int index = 0;
        for (int i = 0; i < uniqueSymbolsCount.length; i++) {
            if (min > uniqueSymbolsCount[i]) {
                min = uniqueSymbolsCount[i];
                index = i;
            }
        }
        System.out.println("Cлово, в котором число различных символов минимально: " + words[index]);
        return words[index];
    }

    /*4. Дана строка произвольной длины с произвольными словами.
    Написать программу для проверки является ли любое выбранное слово в
    строке палиндромом.
    Например, есть строка, вводится число 3, значит необходимо проверить
    является ли 3-е слово в этой строке палиндромом.
    Предусмотреть предупреждающие сообщения на случаи ошибочных
    ситуаций: например, в строке 5 слов, а на вход программе передали число
        500 и т. п. ситуации.*/
    public static boolean isWordPalindrome(String string, int number) {
        String[] words = string.split(" ");
        if (words.length <= number || number < 0) {
            System.out.println("Invalid index");
            return false;
        } else {
            String chosenWord = words[number];
            boolean isPalindrome = chosenWord.equals(new StringBuilder(chosenWord).reverse().toString());
            if (isPalindrome) {
                System.out.println("Word \"" + chosenWord + "\" is palindrome");
            } else {
                System.out.println("Word \"" + chosenWord + "\" is not palindrome");
            }
            return isPalindrome;
        }
    }
}
