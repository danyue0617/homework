import java.util.Scanner;

public class Nxs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int num = scanner.nextInt();
        String num1 = String.valueOf(num);
        System.out.println("您输入的正整数的位数是："+ num1.length());
        System.out.print("您输入的正整数的逆序是：");
        reverseSUM(num1);
    }

    public static void reverseSUM(String s) {
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}