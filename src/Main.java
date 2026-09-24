class Main {
    static void attackCharacter(GameCharacter character) {
        character.attack();
    }

    public static void main(String[] args) {
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
    }
}