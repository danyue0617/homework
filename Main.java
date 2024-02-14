import JAVA_Lei_DuiXiang.Book.Book;
import JAVA_Lei_DuiXiang.Calculator.Calculator;
import JAVA_Lei_DuiXiang.Vehicle.Car;
import JAVA_Lei_DuiXiang.Vehicle.Truck;
import JAVA_Lei_DuiXiang.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("<-------第一题------->");
//TODO:在此编写第一题测试代码
        public class Book {
            private String title;
            private String author;
            private int year;

            public Book() {
            }

            public Book(String title, String author, int year) {
                this.title = title;
                this.author = author;
                this.year = year;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getAuthor() {
                return author;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public void displayInfo() {
                System.out.println("Title:" + title + ", Author:" + author + ", Year:" + year);
            }
        }
        /*
        测试类
         */
        public class BookDemo {
            public static void main(String[] args) {
                JAVA_Lei_DuiXiang.Book.Book b = new JAVA_Lei_DuiXiang.Book.Book("Java Programming", " John Smith", 2022);
                b.displayInfo();
            }
        }
        System.out.println("<-------第二题------->");
//TODO:在此编写第二题测试代码
        public class Vehicle {
            private String brand;
            private String color;
            private int speed;
            private int wheels;

            public Vehicle() {
            }

            public Vehicle(String brand, String color, int speed, int wheels) {
                this.brand = brand;
                this.color = color;
                this.speed = speed;
                this.wheels = wheels;
            }

            public String getBrand() {
                return brand;
            }

            public void setBrand(String brand) {
                this.brand = brand;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public int getSpeed() {
                return speed;
            }

            public void setSpeed(int speed) {
                this.speed = speed;
            }

            public int getWheels() {
                return wheels;
            }

            public void setWheels(int wheels) {
                this.wheels = wheels;
                System.out.println("车轮的个数是：" + wheels);
            }
        }
        public class Car extends JAVA_Lei_DuiXiang.Vehicle.Vehicle {
            private int laoder;

            public Car() {
            }

            public Car(String brand, String color, int speed, int wheels, int laoder) {
                super(brand, color, speed, wheels);
                this.laoder = laoder;
                System.out.println("车轮的个数是：" + wheels);
                if (laoder <= 5) {
                    System.out.println("这是一辆小车，能载5人，实载" + laoder + "人");
                } else {
                    System.out.println("这是一辆小车，能载5人，实载" + laoder + "人,你超员了!");
                }
            }

            public int getLaoder() {
                return laoder;
            }

            public void setLaoder(int laoder) {
                this.laoder = laoder;
                if (laoder <= 5) {
                    System.out.println("这是一辆小车，能载5人，实载" + laoder + "人");
                } else {
                    System.out.println("这是一辆小车，能载5人，实载" + laoder + "人,你超员了!");
                }
            }

            public void start() {
                System.out.println("Car is started");
            }

            public void accelerate(int speed) {
                System.out.println("Car is accelerating at speed " + speed + " km/h");
            }

            public void brake() {
                System.out.println("Car is braking");
            }
        }
        public class Truck extends JAVA_Lei_DuiXiang.Vehicle.Vehicle {
            private int laoder;
            private int payoad;

            public Truck() {
            }

            public Truck(String brand, String color, int speed, int wheels, int laoder, int payoad) {
                super(brand, color, speed, wheels);
                this.laoder = laoder;
                this.payoad = payoad;
                System.out.println("车轮的个数是：" + wheels);
                if (laoder <= 3) {
                    System.out.println("这是一辆卡车，能载3人，实载" + laoder + "人");
                } else {
                    System.out.println("这是一辆卡车，能载3人，实载" + laoder + "人,你超员了!");
                }
                if (payoad <= 5000) {
                    System.out.println("这是一辆卡车，核载5000kg，你已装载" + payoad + "kg");
                } else {
                    System.out.println("这是一辆卡车，核载5000kg，你已装载" + payoad + "kg，你超载了！！！");
                }
            }

            public int getLaoder() {
                return laoder;
            }

            public void setLaoder(int laoder) {
                this.laoder = laoder;
                if (laoder <= 3) {
                    System.out.println("这是一辆卡车，能载3人，实载" + laoder + "人");
                } else {
                    System.out.println("这是一辆卡车，能载3人，实载" + laoder + "人,你超员了!");
                }
            }

            public int getPayoad() {
                return payoad;
            }

            public void setPayoad(int payoad) {
                this.payoad = payoad;
                if (payoad <= 5000) {
                    System.out.println("这是一辆卡车，核载5000kg，你已装载" + payoad + "kg");
                } else {
                    System.out.println("这是一辆卡车，核载5000kg，你已装载" + payoad + "kg，你超载了！！！");
                }
            }

            public void start() {
                System.out.println("Truck is started");
            }

            public void accelerate(int speed) {
                System.out.println("Truck is accelerating at speed " + speed + " km/h");
            }

            public void brake() {
                System.out.println("Truck is braking");
            }

        }
        /*
        测试类
         */
        public class VehicleDemo {
            public static void main(String[] args) {
                JAVA_Lei_DuiXiang.Vehicle.Car myCar = new JAVA_Lei_DuiXiang.Vehicle.Car("Toyota", "Red", 0, 4, 3);
                myCar.start();
                myCar.accelerate(60);
                myCar.brake();
                System.out.println("--------------------");
                JAVA_Lei_DuiXiang.Vehicle.Truck myTruck = new JAVA_Lei_DuiXiang.Vehicle.Truck("Volvo", "Blue", 0, 6, 2, 3000);
                myTruck.start();
                myTruck.accelerate(40);
                myTruck.brake();
                System.out.println("--------------------");
                JAVA_Lei_DuiXiang.Vehicle.Car myCarPro = new JAVA_Lei_DuiXiang.Vehicle.Car("Toyota", "Red", 0, 4, 6);
                System.out.println("--------------------");
                JAVA_Lei_DuiXiang.Vehicle.Truck myTruckPro = new JAVA_Lei_DuiXiang.Vehicle.Truck("Volvo", "Blue", 0, 6, 2, 80000);
            }
        }
        System.out.println("<-------第三题------->");
//TODO:在此编写第三题测试代码
        public class Calculator {
            public double add(double a, double b) {
                return a + b;
            }

            public double subtract(double a, double b) {
                return a - b;
            }

            public double multiply(double a, double b) {
                return a * b;
            }

            public double divide(double a, double b) {
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Cannot divide by zero");
                    return 0;
                }
            }
        }
        import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

        public class CalculatorDemo {
            public static void main(String[] args) {
                JAVA_Lei_DuiXiang.Calculator.Calculator c = new JAVA_Lei_DuiXiang.Calculator.Calculator();
                System.out.println("Addition：" + c.add(2.0, 3.0));
                System.out.println("Subtraction: " + c.subtract(5.0, 3.0));
                System.out.println("Multiplication: " + c.multiply(2.0, 5.0));
                System.out.println("Division: " + c.divide(5.0, 2.0));
                System.out.println("---------------");
                Scanner sc = new Scanner(System.in);
                System.out.print("请输入相加的第一个数：");
                String a = sc.nextLine();
                System.out.print("请输入相加的第二个数：");
                String b = sc.nextLine();
                System.out.println(getSum(a, b));
            }

            public static String getSum(String a, String b) {
                List<Integer> la = new ArrayList<Integer>();
                List<Integer> lb = new ArrayList<Integer>();
                String c = "";
                for (int i = a.length() - 1; i >= 0; --i) {
                    la.add(a.charAt(i) - '0');
                }
                for (int i = b.length() - 1; i >= 0; --i) {
                    lb.add(b.charAt(i) - '0');
                }
//TODO:在此处编写符合要求的代码
                for (int i = 0; i < la.size() && i < lb.size(); i++) {
                    int m = la.get(i) + lb.get(i);
                    c += m;
                }
                if (la.size() >= lb.size()) {
                    for (int i = lb.size(); i < la.size(); i++) {
                        c += la.get(i);
                    }
                } else {
                    for (int i = la.size(); i < lb.size(); i++) {
                        c += lb.get(i);
                    }
                }
                return c;
            }
        }
        System.out.println("<-------第四题------->");
//TODO:在此编写第四题测试代码
        public class Commom_Prefix {
            public static void main(String[] args) {
                String[] a = {"flower", "flow", "flight"};
                String b = longestCommonPrefix(a);
                if (b.equals("")) {
                    System.out.println(b);
                    System.out.println("输入不存在公共前缀。");
                } else {
                    System.out.println(b);
                }
                String[] aa = {"dog", "racecar", "car"};
                String c = longestCommonPrefix(aa);
                if (c.equals("")) {
                    System.out.println(c);
                    System.out.println("输入不存在公共前缀。");
                } else {
                    System.out.println(c);
                }
            }

            public static String longestCommonPrefix(String[] strs) {
                String ans = "";
//TODO:在此处编写符合要求的代码，并在主类中编写测试代码
                StringBuilder sb = new StringBuilder(ans);
                if (strs == null) {
                    return ans;
                }
                String b = strs[0];
                int[] arr = new int[strs.length];
                for (int i = 1; i < strs.length; i++) {
                    int count = 0;
                    for (int j = 0; j < b.length() && j < strs[i].length(); j++) {
                        if (b.charAt(j) == strs[i].charAt(j)) {
                            count++;
                        } else {
                            break;
                        }
                    }
                    arr[i] = count;
                }
                int flag;
                for (int i = 2; i < strs.length; i++) {
                    if (arr[1] > arr[i]) {
                        arr[1] = arr[i];
                    }
                }
                if (arr[1] == 0) {
                    return ans;
                }
                for (int i = 0; i < arr[1]; i++) {
                    ans += b.charAt(i);
                }
                return ans;
            }
        }
    }