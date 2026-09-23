abstract class GameCharacter {
    private final String name;
    private int health;

    private static int count = 0;

    private static final String GAME_NAME = "My Game";

    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = Math.max(health, 0);
        ++count;
    }


    //методы


    void takeDamage(int damage) {
        if (damage <= 0) {
            System.out.println("Ошибка, урон должен быть > 0");
            return;
        }

        if (damage > this.health) {
            this.health = 0;
            return;
        }

        this.health -= damage;
    }

    void heal(int amount) {
        if (amount <= 0) {
            System.out.println("Ошибка, лечение должно быть > 0");
            return;
        }

        this.health += amount;
    }


    //абстрактные методы


    abstract void attack();

    abstract String getType();


    //вывод и геттеры, сеттеры


    void printInfo() {
        System.out.println(
                "Тип: " + this.getType() +
                "\nИмя: " + this.name +
                "\nЗдоровье: " + this.health);
    }

    //

    static String getGameName() {
        return GAME_NAME;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    //

}
