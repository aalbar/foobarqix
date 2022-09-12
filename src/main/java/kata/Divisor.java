package kata;

public enum Divisor {

    FOO(3, "Foo"),
    BAR(5, "Bar"),
    QIX(7, "Qix");

    private final Integer divisor;
    private final String value;

    Divisor(Integer divisor, String value) {
        this.divisor = divisor;
        this.value = value;
    }

    public Integer getDivisor() {
        return divisor;
    }

    public String getValue() {
        return value;
    }
}
