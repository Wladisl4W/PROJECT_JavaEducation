import java.util.HashMap;
import java.util.Map;

public class GameScoreBoard {
    private final Map<String, Integer> scoreBoard = new HashMap<>();

    public void addPlayer(String player) {
        if (!scoreBoard.containsKey(player))
            scoreBoard.put(player, 0);
    }

    public void addPoints(String player, Integer points) {
        scoreBoard.put(player, scoreBoard.get(player) + points);
    }

    public int getPoints(String player) {
        return scoreBoard.get(player);
    }

    public boolean isPlayer(String player) {
        return scoreBoard.containsKey(player);
    }

    public void removePLayer(String player) {
        scoreBoard.remove(player);
    }

    public void printScoreBoard() {
        for (String player : scoreBoard.keySet()) {
            System.out.println(
                    "Игрок: " + player +
                    ", его очки: " + scoreBoard.get(player)
            );
        }
    }

    public int getPlayerCount() {
        return scoreBoard.size();
    }

}
