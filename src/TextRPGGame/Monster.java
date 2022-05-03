package TextRPGGame;

import java.util.Random;

public class Monster implements Attributes {

    int hp;
    int exp;

    Random random = new Random();

    @Override
    public void healthPoints() {
    }

    @Override
    public void givenExperiencePoints() {
    }

    @Override
    public int givenDamage() {
        int damage = random.nextInt();
        return damage;
    }

    void displayMonsterStats() {
        System.out.println("Monster stats:");
        System.out.println("HP: " + hp);
        System.out.println("EXP: " + exp);
    }
}
