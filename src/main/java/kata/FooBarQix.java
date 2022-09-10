package kata;

public class FooBarQix {

    public String compute(String input) {
        if (Integer.parseInt(input) % 3 == 0) return "Foo";
        return input;
    }
}
