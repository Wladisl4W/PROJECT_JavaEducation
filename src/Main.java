import java.util.*;

class Main {
    static  int parseLevel(String text) {
        return Integer.parseInt(text);
    }

    static void attackCharacter(GameCharacter character) {
        character.attack();
    }

    public static void main(String[] args) { /*
        GameCharacter[] characters = {
                new Warrior("Arthur", 100, 50),
                new Mage("Merlin", 80, 120),
                new Archer("Robin", 90, 30),
                new Dragon("Denis", 100, 90)
        };

        for (GameCharacter character : characters) {
            character.printInfo();
            character.attack();
            System.out.println();
        }

        MagicUser[] magicUsers = {
                new Mage("Mage-2", 50, 100),
                new Dragon("Dragon-2", 120, 90)
        };

        for (MagicUser magicUser : magicUsers) {
            magicUser.castSpell();
        }

        for (GameCharacter character : characters) {
            if (character instanceof MagicUser magicUser) {
                System.out.println(character.getName() + " умеет использовать магию!");
                magicUser.castSpell();
            }
        }

        GameItem item1 =
                new GameItem(
                        "Dragon Sword",
                        10,
                        "Legendary"
                );

        GameItem item2 =
                new GameItem(
                        "Dragon Sword",
                        10,
                        "Legendary"
                );

        GameItem item3 =
                new GameItem(
                        "Wooden Sword",
                        1,
                        "Common"
                );

        System.out.println(item1);

        System.out.println(item1 == item2);

        System.out.println(
                item1.equals(item2)
        );

        System.out.println(
                item1.equals(item3)
        );

        System.out.println(
                item1.hashCode()
        );

        System.out.println(
                item2.hashCode()
        );

        GameItem item4 = item1;

        System.out.println(item1 == item4);      // true
        System.out.println(item1.equals(item4)); // true

        Inventory inventory = new Inventory(1000);
        inventory.addGold(500);
        try {
            inventory.spendGold(300);
        } catch (NotEnoughGoldException e) {
            System.out.println(e);
        }

        try {
            inventory.spendGold(5000);
        } catch (NotEnoughGoldException e) {
            System.out.println(e);
        } finally {
            System.out.println(
                    "Текущий баланс: " +
                    inventory.getGold()
            );
        }

        try {
            inventory.addGold(-100);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        int a1 = parseLevel("25");

        try {
            int a2 = parseLevel("abc");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        Inventory inventory = new Inventory();

        GameItem sword =
                new GameItem(
                        "Dragon Sword",
                        10,
                        "Legendary"
                );

        GameItem potion =
                new GameItem(
                        "Health Potion",
                        1,
                        "Common"
                );

        GameItem bow =
                new GameItem(
                        "Elven Bow",
                        7,
                        "Epic"
                );

        inventory.addItem(sword);
        inventory.addItem(potion);
        inventory.addItem(bow);

        inventory.printItems();

        GameItem anotherSword =
                new GameItem(
                        "Dragon Sword",
                        10,
                        "Legendary"
                );


        System.out.println(sword == anotherSword);

        System.out.println(
                inventory.containsItem(anotherSword)
        );

        inventory.removeItem(anotherSword);
        inventory.printItems();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 10; i <= 50; i+=10) {
            numbers.add(i);
        }

        for (Integer i : numbers) {
            System.out.println(i);
        }

        numbers.remove(Integer.valueOf(30));

        for (Integer i : numbers) {
            System.out.println(i);
        }


        SkillBook skillBook = new SkillBook();

        System.out.println(
                skillBook.learnSkill("Fireball")
        );

        System.out.println(
                skillBook.learnSkill("Heal")
        );

        System.out.println(
                skillBook.learnSkill("Teleport")
        );

        System.out.println(
                skillBook.learnSkill("Fireball")
        );

        System.out.println(
                skillBook.getSkillsCount()
        );

        skillBook.printSkills();

        System.out.println(
                skillBook.hasSkill("Heal")
        );

        System.out.println(
                skillBook.hasSkill("Ice Storm")
        );

        skillBook.forgetSkill("Heal");
        skillBook.printSkills();

        Set<GameItem> uniqueItems = new HashSet<>();

        GameItem sword1 =
                new GameItem(
                        "Dragon Sword",
                        10,
                        "Legendary"
                );

        GameItem sword2 =
                new GameItem(
                        "Dragon Sword",
                        10,
                        "Legendary"
                );

        GameItem bow =
                new GameItem(
                        "Elven Bow",
                        7,
                        "Epic"
                );

        System.out.println(
                uniqueItems.add(sword1)
        );

        System.out.println(
                uniqueItems.add(sword2)
        );

        System.out.println(
                uniqueItems.add(bow)
        );

        System.out.println(
                "Количество: " +
                        uniqueItems.size()
        );

        for (GameItem item : uniqueItems) {
            System.out.println(item);
        }

        */

        GameCharacter a1 = new Warrior(
                "a1", 100, 50
        );

        GameCharacter a2 = new Mage(
                "a2", 100, 50
        );

        GameCharacter a3 = new Archer(
                "a3", 100, 50
        );

        GameScoreBoard scoreBoard = new GameScoreBoard();

        scoreBoard.addPlayer(a1.getName());
        scoreBoard.addPlayer(a2.getName());
        scoreBoard.addPlayer(a3.getName());

        scoreBoard.addPoints(a1.getName(), 10);
        scoreBoard.addPoints(a1.getName(), 15);
        scoreBoard.addPoints(a2.getName(), 20);

        scoreBoard.addPlayer(a2.getName());

        scoreBoard.printScoreBoard();

        System.out.println(scoreBoard.isPlayer(a1.getName()));
        System.out.println(scoreBoard.isPlayer("123"));

        scoreBoard.removePlayer(a2.getName());

        String[] x = {
                "apple",
                "banana",
                "apple",
                "orange",
                "banana",
                "apple"
        };

        Map<String, Integer> m = new HashMap<>();

        for (String string : x) {
            m.put(string, m.getOrDefault(string, 0) + 1);
        }

        for (String s : m.keySet()) {
            System.out.println(s + " -> " + m.get(s));
        }
    }
}