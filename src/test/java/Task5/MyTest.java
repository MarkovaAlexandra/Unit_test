package Task5;

import org.junit.jupiter.api.Test;
public class MyTest {


    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 2 : "хватит отдыхать";
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }

    public static void assertConditionB() {
        int x = 1;
        assert x >= 0 : "x должен быть положительным";
    }

    public static int sum(int a, int b) {
        System.out.println(Integer.MAX_VALUE);
        long result = (long)a + b;
        System.out.println(result);
        assert result <= Integer.MAX_VALUE : "переполнение INTEGER";
        return a + b;
    }

    public static void main(String[] args) {
        assertConditionA();

        assertConditionB();
        System.out.println(sum(100000000, 2000000000));
    }
}