package Field;

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

public class Battlefield {

    public static ArrayList<Character> newTeam(int cord){
    Random random = new Random();
    int len = 10;
    ArrayList<Character> team = new ArrayList<>();
    for (int i = 0; i < len; i++) {
        int temp = random.nextInt(0, 7);
        switch (temp) {
            case 1:team.add(new Outlaw(i,cord));break;
            case 2:team.add(new Peasant(i,cord));break;
            case 3:team.add(new Spearman(i,cord));break;
            case 4:team.add(new Monk(i,cord));break;
            case 5:team.add(new Wizard(i,cord));break;
            case 6:team.add(new Crossbowman(i,cord));break;
            case 7:team.add(new Sniper(i,cord));break;
        }
    }
    for (int i = 0; i < team.size(); i++) {

        System.out.println(team.get(i).getInfo());
        System.out.println(team.get(i).getCoordinates(team.get(i)));
    }
    return team;
}
}
