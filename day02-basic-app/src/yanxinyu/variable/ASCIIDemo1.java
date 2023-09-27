package yanxinyu.variable;

/**
 * 目标：掌握ASCLL码的编码特点。
 */
public class ASCIIDemo1 {
    public static void main(String[] args) {
        // 97 + 10 = 107
        System.out.println('a' + 10);
        // 65 + 10 = 107
        System.out.println('A' + 10);
        // 48 + 10 = 107
        System.out.println('0' + 10);

        // 二进制、八进制、十六进制在程序中的写法
        // 二进制
        int a1 = 0B01100001;
        System.out.println(a1);

        // 八进制
        int a2 = 0141;
        System.out.println(a2);

        // 十六进制
        int a3 = 0xFA;
        System.out.println(a3);
    }
}
