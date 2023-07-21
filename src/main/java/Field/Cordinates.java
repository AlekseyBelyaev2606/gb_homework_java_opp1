package Field;

import java.util.ArrayList;

public class Cordinates {
    public int x;
    public int y;

    public Cordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(Character temp){
        return x;
    }
    public int getY(Character temp){
        return y;
    }

     public int distanceMin (ArrayList<Character>team, Character Unit){
        int [] tempArray = new int[10];
        int x1 = getX(Unit);
        int y1 = getY(Unit);
         for (int i = 0; i < team.size(); i++) {
             Character temp = team.get(i);
             int x = getX(temp);
             int y = getY(temp);
             double sqrt = Math.sqrt(Math.pow((x - x1), 2) + (Math.pow((y - y1), 2)));
         }
         return sqrt;
     }

}
