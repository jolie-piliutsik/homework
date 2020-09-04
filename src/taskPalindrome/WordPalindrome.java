package taskPalindrome;

public class WordPalindrome {
    public static void main(String[] args) {
        String word = new String("шалаш"); //введите слово
        char[] wordArray = word.toCharArray(); //переводим слово в массив
        for (int i = 0; i < wordArray.length; i++) {
            System.out.println(i + ": " + wordArray[i]); //выводим индексы букв нашего слова
        }

        for (int i = 0; i < wordArray.length / 2; i++) {
            if (wordArray[i] != wordArray[wordArray.length - i - 1]) {
                System.out.println("Слово " + "" + word + "" + " не является палиндромом");
                break;
            } else {
                System.out.println("Слово " + "" + word + "" + " является палиндромом");
                break;
            }
        }
    }
}