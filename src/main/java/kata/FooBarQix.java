package kata;

public class FooBarQix {

    public String compute(String input) {
        if (Integer.parseInt(input) % 3 == 0) return "Foo";
        if (Integer.parseInt(input) % 5 == 0) return "Bar";
        if (Integer.parseInt(input) % 7 == 0) return "Qix";
        return input;
    }
}
