package yanxinyu.operator;

/**
 * 目标：掌握扩展运算符的使用。
 */
public class OperatorDemo3 {
    public static void main(String[] args) {
        // +=
        double a = 9.5;
        double b = 52;
        a += b; // a = (double)(a + b);
        System.out.println(a);

        // -=
        double i = 600;
        double j = 520;
        i -= j;
        System.out.println(i);

        // *= /= %=
        int m = 10;
        int n = 5;
        m *= n; // m = (int)(m + n)
        System.out.println(m);
        m /= n;
        System.out.println(m);
        m %= n;
        System.out.println(m);

        System.out.println("------------------------------");

        byte x = 10;
        byte y = 30;
        //x = x + y; // 编译报错
        x = (byte) (x + y);
        System.out.println(x);
        x += y;
        System.out.println(x);
    }
}
