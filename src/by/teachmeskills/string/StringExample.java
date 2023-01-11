package by.teachmeskills.string;

import java.util.Scanner;

/*
    Ввести n строк с консоли, найти самую короткую и самую длинную строки.
    Вывести найденные строки и их длину.
    для вывода результат используйте StringBuilder
 */
public class StringExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = sc.nextInt();
        String[] lines = new String[n];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку №" + (i + 1) + ": ");
            lines[i] = sc.nextLine();
        }

        String min = lines[0];
        String max = lines[0];
        for (String line : lines) {
            int length = line.length();
            if (min.length() > length) {
                min = line;
            }
            if (max.length() < length) {
                max = line;
            }
        }

        StringBuilder sb = new StringBuilder().append("Самая короткая строка:\n")
                                              .append(min)
                                              .append("\n")
                                              .append("Самая длинная строка:\n")
                                              .append(max);
        System.out.println(sb);
    }
}
