public class Supervillain {
    // Declare attributes
    private String name;
    private String ability;
    private int powerLevel;

    // Constructor to initialize name, ability, and powerLevel
    public Supervillain(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    // Method: displayVillain
    public void displayVillain() {
        System.out.println("Villain Identity: " + this.name);
        System.out.println("Abilities: " + this.ability);
        System.out.println("Power Level: " + this.powerLevel);
        System.out.println("------------------------------------");
    }
}