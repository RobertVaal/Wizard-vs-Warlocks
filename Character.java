public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 125;
    public int manaPoints = 60;
    public int recover = 80;

    Character(String name) {
        characterName = name;
    }

    public void damageTarget(Character enemyCharacter, int damagePoints) {
        System.out.println("Status");
        System.out.println("~~~~~~~~~~~~~~~~");
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println(enemyCharacter.characterName + " HP Left = " + enemyCharacter.healthPoints);

        if (enemyCharacter.healthPoints <= 0) {
            System.out.println(enemyCharacter.characterName + " is now defeated! ");
        }

    }

    public void healTarget(Character enemyCharacter, int healPoints) {

        enemyCharacter.healthPoints += healPoints;
        System.out.println(enemyCharacter.characterName + " HP Left = " + enemyCharacter.healthPoints);

    }

    public void manaTarget(Character enemyCharacter, int manaPoints) {

        enemyCharacter.manaPoints -= manaPoints;
        System.out.println(characterName + " Mana Left = " + enemyCharacter.manaPoints);

    }

    public void manaTargett(Character enemyCharacter, int manaPoints) {

        enemyCharacter.manaPoints -= manaPoints;
        System.out.println(characterName + " Mana Left = " + enemyCharacter.manaPoints);

    }

    public void levelTarget(Character enemyCharacter, int level) {

        enemyCharacter.level += 200;
        System.out.println(characterName + " is now gain 25 level! ");
        System.out.println(characterName + " Level is = " + enemyCharacter.level);
        enemyCharacter.level = level;
        System.out.println(enemyCharacter.characterName + " Level is = " + enemyCharacter.level);

    }

    public void manadTarget(Character characterName, int manaPoints) {

        characterName.manaPoints += 150;
        System.out.println(characterName.characterName + " Mana Left = " + characterName.manaPoints);

    }
}
