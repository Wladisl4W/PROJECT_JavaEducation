class Warrior extends GameCharacter implements Defendable{
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

    @Override
    public void defend() {
        System.out.println(
                "Воин " + this.getName() +
                " защищается щитом!"
        );
    }
}
