public class Inventory {
    private int gold;

    public Inventory(int gold) {
        if (gold < 0) {
            throw new IllegalArgumentException(
                    "Начальное количество золота не может быть отрицательным"
            );
        }
        this.gold = gold;
    }

    void spendGold(int amount) throws NotEnoughGoldException {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Сумма снятия должна быть > 0"
            );
        }
        if (amount > this.gold) {
            throw new NotEnoughGoldException("Недостаточно денег!");
        }
        this.gold -= amount;
    }

    public void addGold(int amount) {
        if (amount < 0)
        {
            throw new IllegalArgumentException(
                    "Ты дебил!"
            );
        }
        this.gold += amount;
    }

    public int getGold() {
        return gold;
    }
}
