import java.util.Random;

public class Shooter extends Character{
    int shoot;

    public int getShoot(int power, int shoot){
        int tempHit = (power + shoot) * new Random().nextInt(10);
        return tempHit;
    }
    public Shooter(int health, int power, int speed, int magic) {
        super(health, power, speed, magic);
    }
}
