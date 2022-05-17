public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }

    public void Batimpact(Character enemyCharacter) {

        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Bat Impact (Damage - 50 , Mana Cost - 10)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 10;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Sanguineclaws(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Sanguine Claws (Damage - 50 , Mana Cost - 15)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 15;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Batsfeast(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Bats Feast (Damage - 50 , Mana Cost - 25)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Regen(Character characterName) {
        System.out.println(super.characterName + " Use Regen to heal (Heal - 50)");
        int healPoints = 50;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }
}