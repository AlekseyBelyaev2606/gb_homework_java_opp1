package Units.Shooter;

import Units.Character;

import java.util.ArrayList;
import java.util.Random;

public abstract class Shooter extends Character {
    int shoot;
    int arrow;

    public Shooter(int health, int power, int speed, int magic, int x, int y) {
        super(health, power, speed, magic, x, y);
    }


    public int getShoot(int power, int shoot){
        int tempHit = (power + shoot) * new Random().nextInt(10);
        return tempHit;
    }

    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return type;
    }

}
