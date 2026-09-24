public class Mage extends GameCharacter implements MagicUser{
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

    @Override
    public void castSpell() {
        System.out.println(
                "Маг " + this.getName() +
                " использует мощное заклинание"
        );
    }
}
