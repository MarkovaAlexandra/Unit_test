package Task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTest {
    private int add (int a, int b){
        return a + b;
    }
    @Test
    public void testAddition(){
        int result = add(3, 5);
        //Проверяем, что результат сложения равен ожидаемому результату (8)
        assertEquals(8,result,"Сумма неверна");
    }

    @Test
    public void myTestAddition(){
        int a = 10;
        int b = 2;
        assertTrue(a + b == 12, "addition mistake");
    }
    @Test
    public void testDivision(){
        int divident = 10;
        int divisor = 2;
        // Проверяем, что деление выполняется без остатка
        assertTrue(divident % divisor == 0, "Деление с остатком");
    }


}
