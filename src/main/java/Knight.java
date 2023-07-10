import java.util.Random;

public class Knight extends Character{
    int hit;
    public int getDamage(int power, int hit){
        int tempHit = (power + hit) * new Random().nextInt(5);
        return tempHit;
    }
    public Knight(int health, int power, int speed, int magic) {
        super(health, power, speed, magic);

    }


}
