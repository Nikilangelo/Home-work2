/**
 * Created by Nikilangelo on 16.03.2016.
 */
public class Rover implements Moveable,Turnable {
    private Direction direction;
    private GroundVisor visor;
    private int x;
    private int y;

    public Rover() {
        visor = new GroundVisor();
    }

    @Override
    public void moveTo(int x, int y) {

    }
    @Override
    public void turnTo(Direction direction) {

    }
    public GroundVisor getVisor(){

        return visor;
    }

}