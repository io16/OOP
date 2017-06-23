package Vehicle;

/**
 * Created by igor on 23.06.17.
 */
public class Car extends Vehicle {
    private static final int SPEED_STEP = 30;
    private static final int MAX_SPEED = 300;

    private int speed = 0;

    Car(String make, String model) {
        super(make, model);
    }

    public void accelerate() {
        if (speed >= MAX_SPEED) return;
        this.speed += SPEED_STEP;
    }

    public void brake() {
        if (speed == 0) return;
        this.speed -= SPEED_STEP;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    void move() {
        for (int i = 0; i < 5; i++) {

            accelerate();
        }
        brake();
        System.out.println("Car speed: " + getSpeed());
    }
}
