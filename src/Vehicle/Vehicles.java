package Vehicle;

/**
 * Created by igor on 23.06.17.
 */
public class Vehicles {
    public static void main(String[] args) {
        Vehicle car = new Car("m1", "cherry amulet");
        Vehicle tank = new Tank("m2", "t-34");
        car.move();
        tank.move();
    }
}
