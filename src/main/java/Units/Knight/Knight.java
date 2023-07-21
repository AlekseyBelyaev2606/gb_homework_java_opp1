package Units.Knight;
import Units.Character;
import java.util.Random;

public abstract class Knight extends Character {
    int hit;

    public Knight(int health, int power, int speed, int magic, int x, int y) {
        super(health, power, speed, magic, x, y);
    }

    public int getDamage(int power, int hit){
        int tempHit = (power + hit) * new Random().nextInt(5);
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
