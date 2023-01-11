package by.teachmeskills.string;

import java.util.Scanner;

/*
    Ввести n строк с консоли.
    Вывести на консоль те строки, длина которых больше средней, а также их длину.
    Для вывода результат используйте StringBuilder
 */
public class AverageLengthStringExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = sc.nextInt();
        String[] lines = new String[n];
        sc.nextLine();

        int lengthSum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку №" + (i + 1) + ": ");
            lines[i] = sc.nextLine();
            lengthSum = lengthSum + lines[i].length();
        }

        double averageLength = (double) lengthSum / n;

        printResult(n, lines, averageLength);
    }

    private static void printResult(int n, String[] lines, double averageLength) {
        StringBuilder sb = new StringBuilder().append("\nРезультат: Строки, длина которых больше средней")
                                              .append(" длины строк в массиве (средняя длина =")
                                              .append(averageLength)
                                              .append("):\n");
        for (int i = 0; i < n; i++) {
            if (lines[i].length() > averageLength) {
                sb.append("№ \"")
                  .append(i + 1)
                  .append(lines[i])
                  .append("\"\n");
            }
        }

        System.out.println(sb);
    }
}
