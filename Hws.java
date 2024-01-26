import java.util.Scanner;
public class Hws {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        String numStr = String.valueOf(num);
        boolean flag = true;
        for (int i = 0; i < numStr.length() / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}