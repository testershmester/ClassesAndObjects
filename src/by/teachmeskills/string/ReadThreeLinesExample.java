package by.teachmeskills.string;

/*
Считайте с клавиатуры три строки. А затем:
1. Выведите на экран третью строку в неизменном виде.
2. Выведите на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
3. Выведите на экран первую строку, предварительно преобразовав ее к нижнему регистру.

● Для вывода результат используйте StringBuilder

 */
public class ReadThreeLinesExample {

    public static final int STRING_NUMBER = 3;
    public static final String PREFIX = "Строка №";

    public static void main(String[] args) {
        String[] lines = StringReader.readLinesFromConsole(STRING_NUMBER);

        StringBuilder sb = new StringBuilder().append(PREFIX + "3: \"")
                                              .append(lines[2])
                                              .append("\"\n")
                                              .append(PREFIX + "2: \"")
                                              .append(lines[1].toUpperCase())
                                              .append("\"\n")
                                              .append(PREFIX + "1: \"")
                                              .append(lines[0].toLowerCase())
                                              .append("\"");
        System.out.println(sb);
    }
}
