import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

public class GoogleMainTest {

    @Test
    public void firstTest() {
        int a = 1;
        int b = 2;
        Assertions.assertFalse(a + b == 0);
    }

    @Test
    public void secondTest() {
        int a = 1;
        int b = 2;
        Assertions.assertFalse(a - b == 0);
    }
}


