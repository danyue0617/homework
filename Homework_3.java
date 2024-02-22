
public class Main {
    public static void main(String[] args) {
        System.out.println("<-------第一题------->");
//TODO:在此编写第一题测试代码
        public class Test {
            public static void main(String[] args) {
                UseCompute uc = new UseCompute();
                Compute c1 = new Add();
                uc.useCom(c1, 4, 2);
                Compute c2 = new Minus();
                uc.useCom(c2, 4, 2);
                Compute c3 = new Muitiplication();
                uc.useCom(c3, 4, 2);
                Compute c4 = new Division();
                uc.useCom(c4, 4, 2);
            }
        }
        System.out.println("<-------第二题------->");
//TODO:在此编写第二题测试代码
        import java.util.Scanner;

        public class Enter_Score {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.print("请输入分数:");
                int score=sc.nextInt();
                if(score<0||score>100){
                    System.out.println("你输入的分数有误,分数必须在 0—100 之间");
                }else{
                    System.out.println("该成绩为:"+score);
                }
            }
        }
        System.out.println("<-------第三题------->");
//TODO:在此编写第三题测试代码
        import java.util.Scanner;

        public class Average_input {
            public static void main(String[] args) {
                int N,sum=0;
                Scanner sc=new Scanner(System.in);
                System.out.println("请输入N的值：");
                N=sc.nextInt();
                for(int i=1;i<=N;i++){
                    System.out.print("请输入第"+i+"个数的值：");
                    int num=sc.nextInt();
                    if(num>=0){
                        sum+=num;
                    }else{
                        System.out.println("N必须是正数或者0，请重新输入");
                        i--;
                        continue;
                    }
                }
                System.out.println("这N个数的平均值为："+sum/N);
            }
        }
        System.out.println("<-------第四题------->");
//TODO:在此编写第四题测试代码
        public class EmployeeDemo {
            public static void main(String[] args) {
                MyDate birthday = new MyDate(2048, 6, 17);
                Employee e=new Employee_2("dongdong","2023",birthday);
                System.out.println(e.toString());
                e.earnings();
            }
        }
        System.out.println("<-------第五题------->");
//TODO:在此编写第五题测试代码
        import java.util.ArrayList;

        public class Subsequence {
            public static void main(String[] args) {
                String S = "abcde";
                String[] words = {"a", "bb", "acd", "ace"};
                ArrayList<String> al = new ArrayList<String>();
                subsequence(S, words, al);
            }

            public static void subsequence(String S, String[] words, ArrayList<String> al) {
                int result = 0;
                for (int i = 0; i < words.length; i++) {
                    if (S.length() < words[i].length()) {
                        continue;
                    } else {
                        int count = 0, flag = 1;
                        for (int j = 0, k = 0; j < S.length(); j++) {
                            if (S.charAt(j) == words[i].charAt(k)) {
                                count++;
                                k++;
                            }
                            if (count == words[i].length()) {
                                result++;
                                al.add(words[i]);
                                break;
                            }
                        }
                    }
                }
                System.out.println(result);
                System.out.print("有" + result + "个是S的子序列的单词：");
                for (int i = 0; i < al.size(); i++) {
                    if (i == al.size() - 1) {
                        System.out.print(al.get(i));
                    } else {
                        System.out.print(al.get(i) + ",");
                    }
                }
            }
        }
    }
}
//TODO:在此处编写作业所需的类，并在主类中测试这些类
//注意相互间的继承关系
System.out.println("<-------第一题------->");

public interface Compute {
    int computer(int n, int m);
}

public class Add implements Compute {
    @Override
    public int computer(int n, int m) {
        return n + m;
    }
}

public class Minus implements Compute {
    @Override
    public int computer(int n, int m) {
        return n - m;
    }
}

public class Muitiplication implements Compute {
    @Override
    public int computer(int n, int m) {
        return n * m;
    }
}

public class Division implements Compute {
    @Override
    public int computer(int n, int m) {
        if (m == 0) {
            System.out.println("除数不能为0");
            return 0;
        }
        return n / m;
    }
}

public class UseCompute {
    public void useCom(Compute com, int one, int two) {
        int result = com.computer(one, two);
        System.out.println("运算结果为：" + result);
    }
}
System.out.println("<-------第四题------->");
public abstract class Employee {
    private String name;
    private String Number;
    private MyDate birthday;

    public Employee(){}
    public Employee(String name, String number, MyDate birthday) {
        this.name = name;
        Number = number;
        this.birthday = birthday;
    }
    public abstract void earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Number='" + Number + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(){}
    public MyDate(int year,int month,int day){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
public class Employee_2 extends Employee {
    public Employee_2(){}
    public Employee_2(String name, String number, MyDate birthday) {
        super(name,number,birthday);
    }
    @Override
    public void earnings() {
        System.out.println("earning:"+10000);
    }
}