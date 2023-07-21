package Units.Knight;

import Field.Cordinates;
import Units.Knight.Knight;

public class Peasant extends Knight {
    public Peasant(){
        super(40,5, 3,0, 0, 0);
        type = "Крестьянин";
    }

    public Peasant(int x, int y){
        super(40,5, 3,0,x,y);
        type = "Крестьянин";
        position = new Cordinates(x,y);
    }

}
