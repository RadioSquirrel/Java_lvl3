import org.junit.Assert;
import org.junit.Test;
import ru.geekbrains.hw6.Main;

public class ArrayCutAfter4Tests {
    @Test
    public void test1() {
        Assert.assertArrayEquals(new int[] {1, 2}, Main.arrayCutAfter4(new int[] {14, 1, 4, 1, 2}));
    }

    @Test(expected = RuntimeException.class)
    public void  runtimeExceptionTest() {
        Main.arrayCutAfter4(new int[] {1, 2});
    }
}