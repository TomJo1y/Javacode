package yanxinyu.operator;

/**
 * 目标：掌握自增自减运算符的使用。
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        a++; // a = a + 1;
        System.out.println(a);
        ++a;
        System.out.println(a);

        a--;
        System.out.println(a);
        --a;
        System.out.println(a);

        System.out.println("-------------------------------");

        int i = 10;
        int rs = ++i; // 先 + 后 赋值
        System.out.println(rs);
        System.out.println(i);

        int j = 10;
        int rs2 = j++; // 先 赋值 后 +
        System.out.println(rs2);
        System.out.println(j);

        System.out.println("---------------------------------------");

        int m = 5;
        int n = 3;
        // m 5 6 5 4
        // n 3 4 3
        //             6 - 5   + 5   -   4 + 4   + 3;
        int result = ++m - --m + m-- - ++n + n-- + 3;
        System.out.println(result);
        System.out.println(m);
        System.out.println(n);

        System.out.println("---------------------------------------");

        int c = 10;
        int d = 5;
        // c 10 11 12 13
        // d 5 4 5
        //            10  +  12 -   4 -   5 + 1 + 12
        int result1 = c++ + ++c - --d - ++d + 1 + c++;
        System.out.println(result1);
        System.out.println(c);
        System.out.println(d);
    }
}
