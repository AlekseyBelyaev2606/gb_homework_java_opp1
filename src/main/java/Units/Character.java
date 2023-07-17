package Units;

import Field.Cordinates;

public abstract class Character implements TheGameInterface {
    public int health;
    public int power;
    public int speed;
    public int magic;
    public String type;
    protected Cordinates cordinates;

    public int movement(int speed, int move){
        int tempMove = move * speed;
        return tempMove;
    }

    public Character(int health, int power, int speed, int magic){
        this.health = health;
        this.power = power;
        this.speed = speed;
        this.magic = magic;
        this.cordinates = getCodinates();
    }


}
