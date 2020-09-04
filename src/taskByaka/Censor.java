package taskByaka;

public class Censor {
    public static void main(String[] args) {
        String str1 = new String ("Бяка, я не бяка, БЯКА, бяКа, я не бяка!");
        String str2 = str1.toLowerCase();
        String str3 = str2.replace("бяка","[вырезано цензурой]");
        System.out.println(str3);
    }
}
