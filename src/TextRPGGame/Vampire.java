package TextRPGGame;

import java.util.Random;

public class Vampire extends Monster {

    int hp = 10;
    int exp = 10;
    Random random = new Random();

    @Override
    public void healthPoints() {
        super.healthPoints();
    }

    @Override
    public void givenExperiencePoints() {
        super.givenExperiencePoints();
    }

    @Override
    public int givenDamage() {
        super.givenDamage();
        int damage = random.nextInt(0, 5);
        return damage;
    }

    @Override
    void displayMonsterStats() {
        System.out.println("Monster stats:");
        System.out.println("HP: " + hp);
        System.out.println("EXP: " + exp);
    }
}
