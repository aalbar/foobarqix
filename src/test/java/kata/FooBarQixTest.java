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

    @Test
    public void should_return_bar_divisible_by_5() {
        Assertions.assertEquals("Bar", new FooBarQix().compute("5"));
    }

    @Test
    public void should_return_Qix_divisible_by_7() {
        Assertions.assertEquals("Qix", new FooBarQix().compute("7"));
    }

    @Test
    public void should_combine_divisible() {
        Assertions.assertEquals("FooBar", new FooBarQix().compute("15"));
        Assertions.assertEquals("FooQix", new FooBarQix().compute("21"));
        Assertions.assertEquals("BarQix", new FooBarQix().compute("70"));
    }

    @Test
    public void should_replace_3_by_Foo() {
        Assertions.assertEquals("Foo", new FooBarQix().compute("13"));
    }

}
