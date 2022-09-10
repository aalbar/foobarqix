package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooBarQixTest {

    @Test
    public void should_return_input() {
        Assertions.assertEquals("1", new FooBarQix().compute("1"));
    }
}
