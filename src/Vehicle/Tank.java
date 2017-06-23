package Vehicle;

/**
 * Created by igor on 23.06.17.
 */
public class Tank extends Vehicle {
    private static final int SPEED_STEP = 10;
    private static final int MAX_SPEED = 100;
    private static final int FUEL_CONSUMPTION = 1;
    private static final int MAX_FUEL_SIZE = 20;

    private int speed = 0;
    private int fuel = 0;

    Tank(String make, String model) {
        super(make, model);
    }

    public void accelerate() {
        if (speed >= MAX_SPEED || fuel <= 0) return;
        this.speed += SPEED_STEP;
        this.fuel -= FUEL_CONSUMPTION;
    }

    public void brake() {
        if (speed == 0) return;
        this.speed -= SPEED_STEP;
    }

    public void refueling() {
        while (fuel < MAX_FUEL_SIZE) {
            this.fuel += 1;
        }
    }

    public int getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }


    @Override
    void move() {
        refueling();

        accelerate();
        accelerate();
        accelerate();
        accelerate();
        accelerate();

        brake();

        System.out.println("Tank speed: " + getSpeed());
        System.out.println("Tank fuel: " + getFuel());
    }
}
