package yanxinyu.variable;

/**
 * 目标：搞清楚变量的注意事项
 *  报错之后先搞清报了什么错误!!!
 */
public class VariableDemo2 {
    public static void main(String[] args) {
        // 1.变量要先声明后使用。
        int age = 18;
        System.out.println(age);

        // 2.变量是什么类型，就应该装什么类型的数据。
        // age = 9.8;

        // 3.变量是从定义开始到"}"截止的范围内有效；且同一个范围内，定义的多个变量，名称不得相同。
        {
            int a = 19;
            System.out.println(a);
        }
        // System.out.println(a);
        System.out.println(age);
        int a = 23;

        // 4.变量定义时可以不赋初始值；但在使用时，变量里必须有值。
        int num;
        num = 100;
        System.out.println(num);
    }
}
