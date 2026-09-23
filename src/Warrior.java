class Warrior extends GameCharacter {
    private int armor;

    public Warrior(String name, int health, int armor) {
        super(name, health);
        this.armor = armor;
    }

    @Override
    void attack() {
        System.out.println("Воин " + super.getName() + " атакует мечом!");
    }

    @Override
    String getType() {
        return "Воин";
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Броня: " + armor);
    }
}
