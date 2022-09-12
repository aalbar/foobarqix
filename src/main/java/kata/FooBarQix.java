package kata;

public class FooBarQix {

    public static final String ZERO = "0";
    public static final String STAR = "*";

    public String compute(String input) {

        String result = divisible(input);
        result += replace(input, !"".equals(result));
        if (!"".equals(result))
            return result;

        return input.replace(ZERO, STAR);
    }

    private String divisible(String input) {

        StringBuilder result = new StringBuilder();
        for (Divisor divisor : Divisor.values())
            if (Integer.parseInt(input) % divisor.getDivisor() == 0) result.append(divisor.getValue());
        return result.toString();
    }

    private String replace(String input, boolean changed) {

        String[] numbers = input.split("");
        StringBuilder result = new StringBuilder();
        for (String number : numbers) {
            for (Divisor divisor : Divisor.values()) {
                if (Integer.parseInt(number) == divisor.getDivisor()) {
                    result.append(divisor.getValue());
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
