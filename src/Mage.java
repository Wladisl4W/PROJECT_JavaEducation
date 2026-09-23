public class Mage extends GameCharacter {
    private int mana;

    public Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    @Override
    void attack() {
        System.out.println("Маг " + super.getName() + " атакует заклинанием!");
    }

    @Override
    String getType() {
        return "Маг";
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Мана: " + mana);
    }
}
