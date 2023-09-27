package yanxinyu.scanner;
import java.util.Scanner;

/**
 * 目标：实现键盘键入数据。
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
        // idea工具会自动帮助我们导入包。
        // 1.创建一个键盘扫描器对象
        Scanner sc = new Scanner(System.in);

        // 2.接收数据
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt(); // 执行到此位置，会开始等待用户输入一个整数，直到用户按下回车键，age才会接收到对应数据。
        System.out.println("年龄是: " + age);

        System.out.println("请输入你的名字：");
        String name = sc.next(); // 执行到此位置，会开始等待用户输入一个字符串，直到用户按下回车键，name才会收到对应数据。
        System.out.println(name + ", 欢迎进入系统~");
    }
}
