package yanxinyu.type;

/**
 * 目标：理解自动类型转换机制。
 */
public class TypeConversionDemo1 {
    public static void main(String[] args) {
        byte a = 12;
        int b = a; // 自动类型转换
        System.out.println(a);
        System.out.println(b);

        int c = 100;
        double d = 100; // 自动类型转换
        System.out.println(c);
        System.out.println(d);

        char ch = 'a';
        int i = ch; // 自动类型转换
        System.out.println(ch);
        System.out.println(i);
    }
}
