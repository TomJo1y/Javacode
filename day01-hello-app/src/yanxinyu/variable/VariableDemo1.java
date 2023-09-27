package yanxinyu.variable;

/**
 * 目标：认识变量，掌握变量运用的好处，变量的特点，应用场景
 */
public class VariableDemo1 {
    public static void main(String[] args) {
        //1.int类型, = 赋值, 从右向左看。
        int age = 23;
        System.out.println(age);

        //2.double类型
        double score = 99.5;
        System.out.println(score);
        System.out.println("-----------------------------");

        //3.优势:便于扩展和维护
        int num = 666;
        System.out.println(num);
        System.out.println(num);
        System.out.println("-----------------------------");

        //4.特点：变量数据可被替换
        int age2 = 18;
        System.out.println(age2);
        age2 = 19;
        System.out.println(age2);
        age2 += 1;
        System.out.println(age2);
        System.out.println("-----------------------------");

        //5.处理方便
        double money = 9.5;
        System.out.println(money);
        money += 10;
        System.out.println(money);
        money -= 5;
        System.out.println(money);
        System.out.println("-----------------------------");
    }
}
