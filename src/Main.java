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
        System.out.println(item1.equals(item4)); // true */

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
    }



}