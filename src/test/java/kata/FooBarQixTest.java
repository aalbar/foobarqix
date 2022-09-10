package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooBarQixTest {

    @Test
    public void should_return_input() {
        Assertions.assertEquals("1", new FooBarQix().compute("1"));
        Assertions.assertEquals("2", new FooBarQix().compute("2"));
    }

    @Test
    public void should_return_foo_divisible_by_3() {
        Assertions.assertEquals("Foo", new FooBarQix().compute("3"));
    }

}
