package yanxinyu.literal;

/**
 * 目标：掌握常见数据在程序中的书写格式，包括整数、小数、字符、字符串、
 */
public class LiteralDemo {
    public static void main(String[] args) {
        //  整数
        System.out.println(666);

        //  小数
        System.out.println(99.5);

        /*
            字符：必须用单引号''， 有且只有一个字符
            特殊字符：\n 代表换行  \t 代表tab
         */
        System.out.println('A');
        System.out.println('0');
        System.out.println(' ');
        System.out.println('\n');
        System.out.println('\t');

        /*
            字符串：必须用双引号""， 内容随意
         */
        System.out.println("abcdsa");

        /*
            布尔值（bool）：true or false；
         */
        System.out.println(true);
    }
}
