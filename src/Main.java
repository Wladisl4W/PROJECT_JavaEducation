class Main {
    static void attackCharacter(GameCharacter character) {
        character.attack();
    }

    public static void main(String[] args) {
        GameCharacter[] characters = {
                new Warrior("Arthur", 100, 50),
                new Mage("Merlin", 80, 120),
                new Archer("Robin", 90, 30)
        };

        for (GameCharacter character : characters) {
            character.printInfo();
            character.attack();
            System.out.println();
        }

        for (GameCharacter character : characters) {
            if (character instanceof Archer archer) {
                archer.printInfo();
                archer.addArrows(10);
                archer.printInfo();
            }
        }

        for (GameCharacter character : characters) {
            attackCharacter(character);
        }
    }
}