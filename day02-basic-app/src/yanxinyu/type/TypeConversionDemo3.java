package yanxinyu.type;

/**
 * 目标：掌握强制类型转换机制
 */
public class TypeConversionDemo3 {
    public static void main(String[] args) {
        /*
        // 范围大----->范围小，报错。
        int a = 20;
        byte b = a;
         */

        int a = 20;
        byte b = (byte) a;   //  ALT + ENTER 强制类型转换快捷键
        System.out.println(a);
        System.out.println(b);

        int i = 1500;
        byte j = (byte) i;
        System.out.println(i);
        System.out.println(j);

        double d = 99.5;
        int m = (int) d;
        System.out.println(m);  //  强制类型转换，丢掉小数部分，保留整数部分
    }
}
