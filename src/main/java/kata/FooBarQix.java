package kata;

import java.util.HashMap;
import java.util.Map;

public class FooBarQix {

    private static final Map<Integer, String> divisors = new HashMap<>();

    static {
        divisors.put(3, "Foo");
        divisors.put(5, "Bar");
        divisors.put(7, "Qix");
    }

    public String compute(String input) {

        String[] numbers = input.split("");
        String replaceResult = replace(numbers);
        if (!"".equals(replaceResult))
            return replaceResult;


        String divisibleResult = divisible(input);
        if (!divisibleResult.equals(""))
            return divisibleResult;
        return input;
    }

    private String divisible(String input) {
        StringBuilder divisibleResult = new StringBuilder();
        for (Integer divisor : divisors.keySet())
            if (Integer.parseInt(input) % divisor == 0) divisibleResult.append(divisors.get(divisor));
        return divisibleResult.toString();
    }

    private String replace(String[] numbers) {
        StringBuilder replaceResult = new StringBuilder();
        for (String number : numbers) {
            for (Integer divisor : divisors.keySet()) {
                if (Integer.parseInt(number) == divisor) {
                    replaceResult.append(divisors.get(divisor));
                }
            }
        }
        return replaceResult.toString();
    }
}
