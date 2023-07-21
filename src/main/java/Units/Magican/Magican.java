package Units.Magican;
import Units.Character;
import java.util.Random;

public abstract class Magican extends Character {
    int magicHit;

    public Magican(int health, int power, int speed, int magic, int x, int y) {
        super(health, power, speed, magic, x, y);
    }

    public int getMagicDamage(int magic, int magicHit){
        int tempHit = (magic + magicHit) * new Random().nextInt(15);
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

