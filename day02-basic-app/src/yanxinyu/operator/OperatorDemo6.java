package yanxinyu.operator;

/**
 * 目标：掌握三元运算符的使用及运算符的优先级。
 */
public class OperatorDemo6 {
    public static void main(String[] args) {
        // 三元运算符
        double score = 55;
        String rs = score > 60 ? "成绩及格" : "成绩不及格";
        System.out.println(rs);

        // 输出两个整数的较大值
        int a = 99;
        int b = 177;
        System.out.println(a > b ? a : b);

        // 输出三个整数的最大值
        int i = 10;
        int j = 45;
        int k = 34;

        int temp = i > j ? i : j;
        int max = temp > k ? temp : k;
        System.out.println(max);

        // 优先级：&& > ||，先执行&& 后执行||
        System.out.println(10 > 3 || 10 > 3 && 10 < 3); // true
        // ()优先级最高
        System.out.println((10 > 3 || 10 > 3) && 10 < 3); // false
    }
}
