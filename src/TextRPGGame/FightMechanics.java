package TextRPGGame;

public class FightMechanics {
    MainCharacter mainCharacter = new MainCharacter();
    Vampire vampire = new Vampire();

    void displayStats() {
        mainCharacter.displayMainCharacterStats();
        System.out.println();
        vampire.displayMonsterStats();
    }

    void playerAttack() {
        int damage = mainCharacter.playerGivenDamage();
        vampire.hp = vampire.hp - damage;
        System.out.println("Player attacked with " + damage + " damage");
    }

    void monsterAttack() {
        int damage = vampire.givenDamage();
        mainCharacter.hp = mainCharacter.hp - damage;
        System.out.println("Monster attacked with " + damage + " damage");
    }


}
