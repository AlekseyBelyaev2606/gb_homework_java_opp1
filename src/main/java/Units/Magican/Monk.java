package Units.Magican;

import Field.Cordinates;
import Units.Magican.Magican;

public class Monk extends Magican {
    public Monk(){
        super(50,5, 3,10, 0, 0);
        type = "Маг";}

    public Monk(int x, int y){
        super(50,5, 3,10, x,y);
        type = "Маг";
        position = new Cordinates(x,y);
    }

    }
