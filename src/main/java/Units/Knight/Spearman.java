package Units.Knight;

import Field.Cordinates;
import Units.Knight.Knight;

public class Spearman extends Knight {
    public Spearman() {
        super(70,8, 3,0, 0, 0);
        type = "Копейщик";
    }
    public Spearman(int x, int y) {
        super(70,8, 3,0, x,y);
        type = "Копейщик";
        position = new Cordinates(x,y);

    }
}
