package yanxinyu.operator;

/**
 * 目标：掌握关系运算符的使用。
 */
public class OperatorDemo4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        boolean rs = a > b;
        System.out.println(rs);

        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a > b ? a : b); // a > b,输出a；反之，输出b
        System.out.println(a != b);
    }
}
