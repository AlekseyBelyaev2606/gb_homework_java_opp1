package Units.Knight;
import Units.Character;
import java.util.Random;

public abstract class Knight extends Character {
    int hit;
    public int getDamage(int power, int hit){
        int tempHit = (power + hit) * new Random().nextInt(5);
        return tempHit;
    }
    public Knight(int health, int power, int speed, int magic) {
        super(health, power, speed, magic);
        type = "Рыцарь";
    }



    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return type;
    }


}
