import Units.Character;
import Units.Knight.Outlaw;
import Units.Knight.Peasant;
import Units.Knight.Spearman;
import Units.Magican.Monk;
import Units.Magican.Wizard;
import Units.Shooter.Crossbowman;
import Units.Shooter.Sniper;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();


        int len = 10;
        ArrayList<Character> team = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int temp = random.nextInt(0, 7);
            switch (temp) {
                case 1:
                    team.add(new Outlaw());

                    break;
                case 2:
                    team.add(new Peasant());
                    break;
                case 3:
                    team.add(new Spearman());
                    break;
                case 4:
                    team.add(new Monk());
                    break;
                case 5:
                    team.add(new Wizard());
                    break;
                case 6:
                    team.add(new Crossbowman());
                    break;
                case 7:
                    team.add(new Sniper());
                    break;
            }
        }
        for (int i = 0; i < team.size(); i++) {

            System.out.println(team.get(i).getInfo());
        }
    }

}
