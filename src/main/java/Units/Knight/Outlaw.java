package Units.Knight;
import Field.Cordinates;
import Units.Knight.Knight;

public class Outlaw extends Knight {
    public Outlaw(){
        super(100,10, 1,0, 0 ,0);
        type = "Разбойник";
    }
    public Outlaw(int x, int y){
        super(100,10, 1,0, 0 ,0);
        type = "Разбойник";
        position = new Cordinates(x,y);
    }
}
