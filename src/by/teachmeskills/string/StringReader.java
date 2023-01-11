package by.teachmeskills.string;

import java.util.Scanner;

public class StringReader {

    public static String[] readLinesFromConsole(int n) {
        Scanner sc = new Scanner(System.in);
        String[] lines = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку №" + (i + 1) + ": ");
            lines[i] = sc.nextLine();
        }
        return lines;
    }
}
