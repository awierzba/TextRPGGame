package TextRPGGame;

import java.util.Random;

public class Skeleton extends Monster {

    int hp = 5;
    int exp = 5;

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
        int damage = random.nextInt(0, 2);
        return damage;
    }


}
