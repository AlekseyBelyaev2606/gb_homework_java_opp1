package Field;

public abstract class Cordinates {
    public int cordX;
    public int cordY;

    public Cordinates(int x, int y) {
        this.cordX = x;
        this.cordY = y;
    }
     public int distance (Cordinates cord, Cordinates cord1){
         int sqrt = Math.sqrt(Math.pow((cord.cordX - cord1.cordX), 2) + (Math.pow(cord.cordY - cord1.cordY), 2);
         return sqrt;
     }
}
