package testing.project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SomeClassTest {

    @Test
    public void testSum() {
        var expected = 5;
        var actual = SomeClass.sum(2, 3);
        assertEquals(expected, actual);
        var y = 1;
    }
}