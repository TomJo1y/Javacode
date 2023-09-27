package yanxinyu.operator;

/**
 * 目标：掌握逻辑运算符的使用。
 */
public class OperatorDemo5 {
    public static void main(String[] args) {
        double size = 6.8;
        int storage = 16;
        // 1.&运算
        boolean rs = size >= 6.95 & storage >= 8;
        System.out.println(rs);

        // 2.|运算
        boolean rs2 = size >= 6.95 | storage >= 8;
        System.out.println(rs2);

        // 3.!运算
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(2 > 1));

        // 4.^ 异或运算
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ false); // false

        System.out.println("------------------------------------------");

        // 5.&&
        System.out.println(2 > 10 && 3 > 2);

        // 6.||
        System.out.println(2 > 1 || 3 < 5);
    }
}
