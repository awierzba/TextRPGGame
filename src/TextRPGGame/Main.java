package TextRPGGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FightMechanics fightMechanics = new FightMechanics();
        Scanner scanner = new Scanner(System.in);

        boolean cont = true;

        while (cont) {
            fightMechanics.displayStats();
            System.out.println("Press 1 to attack");
            int playerInput = scanner.nextInt();
            System.out.println();
            fightMechanics.playerAttack();
            System.out.println();
            fightMechanics.monsterAttack();
            System.out.println();
        }


    }
}
