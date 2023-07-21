package Units.Shooter;

import Field.Cordinates;

public class Crossbowman extends Shooter {

    public Crossbowman(){
        super(70,6, 3,0, 0, 0);
        arrow = 8;
        type = "Арбалетчик";}

    public Crossbowman(int x, int y){
        super(70,6, 3,0, x, y);
        arrow = 8;
        type = "Арбалетчик";
        position = new Cordinates(x,y);}

}
