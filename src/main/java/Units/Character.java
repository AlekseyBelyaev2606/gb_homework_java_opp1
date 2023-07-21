package Units;

import Field.Cordinates;

import java.util.ArrayList;

public abstract class Character implements TheGameInterface {
    public int health;
    public int power;
    public int speed;
    public int magic;
    public String type;
    public Cordinates position;


    public int movement(int speed, int move){
        int tempMove = move * speed;
        return tempMove;
    }

    public Character(int health, int power, int speed, int magic, int x, int y){
        this.health = health;
        this.power = power;
        this.speed = speed;
        this.magic = magic;
        this.position = new Cordinates(x,y);
    }

    public int getX(){
        return position.x;
    }

    public int getY(){
        return position.y;
    }

    public String getCoordinates(Character People){
     return "x " + People.position.x + " y " + People.position.y;
    }

    public int findEnemy(ArrayList<Character>team){
    return 0;
    }
}