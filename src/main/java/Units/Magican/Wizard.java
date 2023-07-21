package Units.Magican;

import Field.Cordinates;
import Units.Magican.Magican;

public class Wizard extends Magican {
    public Wizard() {
        super(50, 7, 3, 20, 0 , 0);
        type = "Монах";
    }
    public Wizard(int x, int y) {
        super(50, 7, 3, 20,x,y);
        type = "Монах";
        position = new Cordinates(x,y);
    }
    }
