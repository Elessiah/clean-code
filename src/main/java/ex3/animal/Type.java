package ex3.animal;

public enum Type {
    MAMMIFERE("Mammifère"),
    POISSON("Poisson"),
    SERPENT("Serpent");

    private final String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
