package Calculator;
/**
 * В классе Calculator создайте метод calculateDiscount,
 * который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
 * Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
 * Если метод calculateDiscount получает недопустимые аргументы,
 * он должен выбрасывать исключение ArithmeticException.
 * Не забудьте написать тесты для проверки этого поведения.
 */
public class Calculator {

    public static double calculate(int operand1, int operand2, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result =  operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if(operand2 != 0){
                result = operand1 / operand2;
                break;}
                else {
                    throw new ArithmeticException("Деление на ноль запрещено");
            }
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        return result;
        }


    public static double calculateDiscount(double total, int discount) {
        if (discount >= 100){
            throw new ArithmeticException("Размер скидки не может быть больше 100 %");
        }
        return total - total * ((double) discount/100);

    }


    public static void main(String[] args) {
        System.out.println(calculateDiscount(500,50));
        System.out.println(calculate(2,0,'/'));
    }
}
