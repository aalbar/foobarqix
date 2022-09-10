package kata;

import java.util.HashMap;
import java.util.Map;

public class FooBarQix {

    public String compute(String input) {
        Map<Integer, String> divisors = new HashMap<>();
        divisors.put(3, "Foo");
        divisors.put(5, "Bar");
        divisors.put(7, "Qix");
        String result = "";
        for (Integer divisor : divisors.keySet())
            if (Integer.parseInt(input) % divisor == 0) result += divisors.get(divisor);
        if (result.equals(""))
            return input;
        return result;
    }
}
