import java.util.Random;

public class Magican extends Character{
    int magicHit;
    public int getMagicDamage(int magic, int magicHit){
        int tempHit = (magic + magicHit) * new Random().nextInt(15);
        return tempHit;
    }
    public Magican(int health, int power, int speed, int magic) {
        super(health, power, speed, magic);
    }
}
