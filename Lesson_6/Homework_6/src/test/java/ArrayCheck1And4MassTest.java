import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.geekbrains.hw6.Main;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArrayCheck1And4MassTest {
    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {true, new int[] {1, 4, 4, 4}},
                {true, new int[] {1, 1, 1, 1, 4, 4}},
                {true, new int[] {4, 1}},
                {true, new int[] {1, 4}},
                {false, new int[] {2}},
                {false, new int[] {1, 2, 4}},
                {false, new int[] {1, 4, 1, 4, 0}},
                {false, new int[] {}}
        });
    }

    private boolean result;
    private int[] inputArray;

    public ArrayCheck1And4MassTest(boolean result, int[] inputArray) {
        this.result = result;
        this.inputArray = inputArray;
    }

    @Test
    public void massTest() {
        Assert.assertEquals(result, Main.arrayCheck1And4(inputArray));
    }
}