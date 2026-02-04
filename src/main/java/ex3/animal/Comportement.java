package ex3.animal;

public enum Comportement {
    HERBIVORE("Herbivore"),
    CARNIVORE("Carnivore"),
    OMNIVORE("Omnivore");

    private final String value;

    Comportement(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
