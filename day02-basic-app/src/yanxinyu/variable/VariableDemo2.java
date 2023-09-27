package yanxinyu.variable;

/**
 * 目标：掌握基本数据类型的使用
 */
public class VariableDemo2 {
    public static void main(String[] args) {
        // 1.byte short int long;
        byte a = -127; // -128 - 127
//        byte a = 128; // 越界

        short s = 13244;

        int i = 4244444;

        // 注意：随便写一个整型变量默认是int类型，424242244444没有超过long的范围，但是超过了int的范围
        // 如果希望随便写一个整型变量默认是long类型，需要在后面加L/l；
        long lg = 424242244444L;

        // 2.float double
        // 注意：随便写小数变量默认是double类型，如果希望是float需要在后面加F/f
        float f = 3.14F;

        double d = 314.222;

        // 3.char
        char ch = 'a';
        char ch1 = '中';

        // 4.boolean
        boolean flag = true;
        boolean flag2 = false;

        // 拓展一种引用数据类型，后面需要使用
        // String为字符串类型，存储字符串数据
        String name = "张三";
    }
}
