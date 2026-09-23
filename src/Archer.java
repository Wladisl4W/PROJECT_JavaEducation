public class Archer extends GameCharacter{
    private int arrows;

    public Archer(String name, int health, int arrows) {
        super(name, health);
        this.arrows = arrows;
    }

    @Override
    void attack() {
        System.out.println("Лучник " + getName() + " стреляет из лука!");
    }

    @Override
    String getType() {
        return "Лучник";
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Кол-во стрел: " + arrows);
    }

    void addArrows(int amount) {
        this.arrows += Math.max(amount, 0);
    }
}
