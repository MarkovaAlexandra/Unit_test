package Task4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MyTest {
    @Test
    void testAssertEquals(){
        assertEquals(5,2 + 3, "сложение неправильно");
    }
    @Test
    void testAssertNotEquals(){
        assertNotEquals(10, 2 * 3, "умножение неправильно");
    }

    @Test
    void testAssertTrue(){
        assertTrue(5 > 3,"утверждение должно быть true");
    }

    @Test
    void testAssertFalse(){
        assertFalse(2 > 5, "утверждение должно быть false");
    }

    @Test
    void testAssertNull(){
        String text = null;
        assertNull(text, "строка должна быть null");
    }

    @Test
    void testAssertNotNull(){
        String text = "hello";
        assertNotNull(text, "строка не должна быть null");

    }
    @Test
    void testAssertSame(){
        Object obj1 = new Object();
        Object obj2 = obj1;
        assertSame(obj1, obj2, "объекты должна быть одинаковыми");
    }

    @Test
    void testAssertNotSame(){
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertNotSame(obj1, obj2, "объекты не должны быть одинаковыми");
    }
}
