package Task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {

    @Test
    public void sumListsTest(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5));
        List<Integer> result = MyClass.sumLists(list1,list2);
        List<Integer> resultExpected = new ArrayList<>(Arrays.asList(4,6,8));
        assertEquals(result, resultExpected, "списки не совпадают");
    }

    @Test
    public void findMaxTest(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(4,8,75,55,2,9));
        int max = MyClass.findMax(list1);
        int maxExpected = 75;
        assertEquals(maxExpected, max, "начения макс не совпадают");

    }

    @Test
    public void filterStringsTest(){
        List<String> words = new ArrayList<>(Arrays.asList("qwert", "asdfg", "zxcvb", "yu"));
        List<String> result = MyClass.filterStrings(words, 3);
        List<String> resultExpected = new ArrayList<>(Arrays.asList("qwert", "asdfg", "zxcvb"));
        assertEquals(resultExpected, result, "списки не равны");
    }
}
