package Units.Shooter;

import Field.Cordinates;

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper() {
        super(50, 10, 7, 0,0,0);
        arrow = 10;
        type = "Снайпер";
    }

    public Sniper(int x, int y){
        super(50, 10, 7, 0, x, y);
        arrow = 10;
        type = "Снайпер";
        position = new Cordinates(x,y);
    }

    @Override
    public void step() {
        if (this.health == 0 || arrow == 0) {
            return;
        }


    }
}
