package yanxinyu.operator;

/**
 * 目标：掌握基本算术运算符的使用
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(5 / 2); // 整数相除还是整数,5/2---->2
        System.out.println(5.0 / 2); // 2.5
        int i = 5;
        int j = 2;
        System.out.println(1.0 * i / j);

        System.out.println(a % b); // 取余操作
        System.out.println("---------------------------------------");

        // 掌握+符号做连接符的情况
        int a2 = 5;
        System.out.println("abc" + a2); // "abc5"
        System.out.println(a2 + 5); // 10
        System.out.println("itheima" + a2 + 'a');
        System.out.println(a2 + 'a' + "itheima"); // 5 + 97 + "itheima"
    }
}
