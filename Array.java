import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        arraysDemo();
    }

    public static void arraysDemo() {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("请输入10个整数:");
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int min = a[0];
        int max = a[9];
        int sum = min + max;
        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);
        System.out.println("最小值和最大值之和: " + sum);
    }
}