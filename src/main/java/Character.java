public abstract class Character {
    public int health;
    public int power;
    public int speed;
    public int magic;

    public int movement(int speed, int move){
        int tempMove = move * speed;
        return tempMove;
    }

    public Character(int health, int power, int speed, int magic){
        this.health = health;
        this.power = power;
        this.speed = speed;
        this.magic = magic;
    }
}
