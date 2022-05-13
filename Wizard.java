public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }

    public void Rasengan(Character enemyCharacter) {

        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Rasengan (Damage - 60 , Mana Cost - 20)");
        int damagePoints = 75;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 10;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Rasenshuriken(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Rasenshuriken (Damage - 50 , Mana Cost - 25)");
        int damagePoints = 80;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 45;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Sagemodenatureenergy(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Sagemodenatureenergy (Damage - 40 , Mana Cost - 35)");
        int damagePoints = 20;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 15;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Ashuramode(Character characterName) {
        System.out.println(super.characterName + " Use Ashuramode (Heal - 40)");
        int healPoints = 20;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }

    public void Summoningjutsu(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with WaterSlash (Damage - 90 , Mana Cost - 15)");
        int damagePoints = 70;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 30;
        manaTargett(enemyCharacter, manaPoints);

    }

    public void Fumashuriken(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with OceanOddity (Damage - 10 , Mana Cost - 10)");
        int damagePoints = 20;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 50;
        manaTarget(enemyCharacter, manaPoints);
        levelTarget(enemyCharacter, level);
    }
