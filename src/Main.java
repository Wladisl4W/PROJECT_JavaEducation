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
    }
}