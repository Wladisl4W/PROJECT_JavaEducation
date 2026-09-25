import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<GameItem> items = new ArrayList<>();


    void addItem(GameItem item) {
        items.add(item);
        System.out.println("Предмет добавлен: " + item.getName());
    }

    void printItems() {
        if (items.isEmpty()) {
            System.out.println("Инвентарь пуст!");
            return;
        }
        for (GameItem item : items) {
            System.out.println(item.toString());
        }
    }

    int getItemCount() {
        return items.size();
    }

    boolean containsItem(GameItem item) {
        return items.contains(item);
    }

    boolean removeItem(GameItem item) {
        return items.remove(item);
    }
}