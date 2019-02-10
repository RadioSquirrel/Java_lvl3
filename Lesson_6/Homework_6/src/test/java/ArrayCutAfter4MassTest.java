import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.geekbrains.hw6.Main;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArrayCutAfter4MassTest {
    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {new int[] {4, 1, 2}, new int[] {1, 2}},
                {new int[] {4}, new int[] {}},
                {new int[] {4, 1, 2, 4}, new int[] {}},
                {new int[] {4, 4, 1, 2}, new int[] {1, 2}},
                {new int[] {4, 1, 2, 3, 4, 5, 4, 3}, new int[] {3}}
        });
    }

    private int[] inputArray;
    private int[] outputArray;

    public ArrayCutAfter4MassTest(int[] inputArray, int[] outputArray) {
        this.inputArray = inputArray;
        this.outputArray = outputArray;
    }

    @Test
    public void massTest() {
        Assert.assertArrayEquals(outputArray, Main.arrayCutAfter4(inputArray));
    }
}