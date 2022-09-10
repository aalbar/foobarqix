package kata;

import java.util.Map;

public class FooBarQix {

    public String compute(String input) {
        Map<Integer, String> divisors = Map.of(3, "Foo", 5, "Bar", 7, "Qix");
        for (Map.Entry<Integer, String> entry : divisors.entrySet())
            if (Integer.parseInt(input) % entry.getKey() == 0) return entry.getValue();
        return input;
    }
}
