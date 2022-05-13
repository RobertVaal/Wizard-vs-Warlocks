public class Warlock extends Character {
    Warlock(String name) {
        super(name);
    }

    public void Chidori(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Chidori (Damage - 50 , Mana Cost - 10)");
        int damagePoints = 35;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 50;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Amaterasu(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Amaterasu (Damage - 60 , Mana Cost - 10)");
        int damagePoints = 20;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 10;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Heavenlyhandpower(Character characterName) {
        System.out.println("Both use Heal");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println(super.characterName + " Use sixpathshealing  (Heal - 40)");
        int healPoints = 70;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }

    public void IndrasArrow(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with IndrasArrow (Damage - 60 , Mana Cost - 25)");
        int damagePoints = 90;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 34;
        manaTarget(enemyCharacter, manaPoints);
    }
}
