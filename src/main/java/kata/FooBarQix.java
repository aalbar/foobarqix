package kata;

import java.util.HashMap;
import java.util.Map;

public class FooBarQix {

    private static Map<Integer, String> divisors = new HashMap<>();

    static {
        divisors.put(3, "Foo");
        divisors.put(5, "Bar");
        divisors.put(7, "Qix");
    }

    public String compute(String input) {
        if (input.contains("3")) {
            return "Foo";
        }

        String result = "";
        for (Integer divisor : divisors.keySet())
            if (Integer.parseInt(input) % divisor == 0) result += divisors.get(divisor);
        if (result.equals(""))
            return input;
        return result;
    }
}
