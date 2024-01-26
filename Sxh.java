import java.util.Scanner;
public class Sxh {
    public static void main(String[] args) {
        ShuiXianHua();
    }

    public static void ShuiXianHua() {
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100;
            if (i == a * a * a + b * b * b + c * c * c) {
                System.out.print(i + " ");
            }
        }
    }
}