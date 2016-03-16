/**
 * Created by Nikilangelo on 16.03.2016.
 */
public class GroundVisor {
    private Ground ground;

    public boolean hasObstacles(int length, int width) throws GroundVisorException{
        if(length > ground.getLength() || width > ground.getWidth())
            throw new GroundVisorException("Output abroad");
        return ground.getCell(length, width).getState() == CellState.OCCUPIED;
    }
    public void setGround(Ground ground){

        this.ground = ground;
    }
}
