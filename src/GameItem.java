import java.util.Objects;

public class GameItem {
    private final String name;
    private final int level;
    private final String rarity;

    public GameItem(String name, int level, String rarity) {
        this.name = name;
        this.level = level;
        this.rarity = rarity;
    }

    @Override
    public String toString() {
        return (
                "GameItem{name='" + this.name +
                "', level=" + this.level +
                ", rarity='" + this.rarity + "'}"
                );
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GameItem gameItem)) return false;
        return this.level == gameItem.level && Objects.equals(this.name, gameItem.name) && Objects.equals(this.rarity, gameItem.rarity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, rarity);
    }
}
