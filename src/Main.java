/**
 * Created by Nikilangelo on 16.03.2016.
 */
public class Main {

    public static void main(String[] args) {
        Rover r = new Rover();
        r.getVisor().setGround(new Ground(10, 10));
        r.moveTo(19, 9);
    }
}