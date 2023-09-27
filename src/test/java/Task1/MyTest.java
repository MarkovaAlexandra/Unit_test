package Task1;

public class MyTest {
    public static void main(String[] args) {
        int x = -10;
        // проверяем, что х неотрицательно, с использованием оператора assert
        assert x >= 0:"x должно быть неотрицательным";
        System.out.println("программа продолжает выполнение");
    }
}
