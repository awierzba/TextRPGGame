package TextRPGGame;

import java.util.Random;

public class MainCharacter {
    int hp = 20;
    int manaPoints = 5;
    int experiencePoints = 0;
    int damage;

    Random random = new Random();

    public MainCharacter() {
    }

    public void displayMainCharacterStats() {
        System.out.println("Main character stats:");
        System.out.println("HP: " + hp);
        System.out.println("MP: " + manaPoints);
        System.out.println("EXP: " + experiencePoints);
    }

    public int playerGivenDamage() {
        int damage = random.nextInt(0, 8);
        return damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }
}
