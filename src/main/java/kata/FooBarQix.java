package kata;

import java.util.HashMap;
import java.util.Map;

public class FooBarQix {

    private static final Map<Integer, String> divisors = new HashMap<>();
    public static final String ZERO = "0";
    public static final String STAR = "*";

    static {
        divisors.put(3, "Foo");
        divisors.put(5, "Bar");
        divisors.put(7, "Qix");
    }

    public String compute(String input) {

        String result = divisible(input);
        result += replace(input, !"".equals(result));
        if (!"".equals(result))
            return result;

        return input.replace(ZERO, STAR);
    }

    private String divisible(String input) {

        StringBuilder result = new StringBuilder();
        for (Integer divisor : divisors.keySet())
            if (Integer.parseInt(input) % divisor == 0) result.append(divisors.get(divisor));
        return result.toString();
    }

    private String replace(String input, boolean changed) {

        String[] numbers = input.split("");
        StringBuilder result = new StringBuilder();
        for (String number : numbers) {
            for (Integer divisor : divisors.keySet()) {
                if (Integer.parseInt(number) == divisor) {
                    result.append(divisors.get(divisor));
                    changed = true;
                }
            }
            if (number.equals(ZERO)) {
                result.append(STAR);
            }
        }
        return (changed) ? result.toString() : "";
    }
}
