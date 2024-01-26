import java.util.Scanner;
public class Yang{
    public static void main(String[] args){
        System.out.println("请输入想要打印的等腰三角形的行数：");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        showTriangle(n);
    }
}
public static void showTriangle(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
            System.out.println(' ');
        }
        for (int k = 1; k <= 2 * i - 1; k++) ;
        {
            System.out.println('*');
        }
        System.out.println();
    }
}