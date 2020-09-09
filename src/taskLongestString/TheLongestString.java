package taskLongestString;

public class TheLongestString {
    public static void main(String[] args) {
        String[] str = new String[3];
        str[0] = new String("Я длинная строка");
        str[1] = new String("Я короткая строка");
        str[2] = new String("Я самая длинная строка");

        int maxLength = 0;
        String maxLengthString = null;

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > maxLength) {
                maxLength = str[i].length();
                maxLengthString = str[i];
            }
        }
        System.out.println("Самая длинная строка в массиве: " + "\"" + maxLengthString + "\".");
    }
}