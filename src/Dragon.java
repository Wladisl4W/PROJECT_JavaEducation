public class Dragon extends GameCharacter implements MagicUser{
    private int firePower;

    public Dragon(String name, int health, int firePower) {
        super(name, health);
        this.firePower = firePower;
    }

    @Override
    void attack() {
        System.out.println(
                "Дракон " + this.getName() +
                " дышит огнём!"
        );
    }

    @Override
    String getType() {
        return "Дракон";
    }

    @Override
    public void castSpell() {
        System.out.println(
                "Дракон " + this.getName() +
                " использует древнюю магию!"
        );
    }
}
