package Products;

/**
 * Created by igor on 23.06.17.
 */
public class Fruit extends Product {
    private boolean isFruitInfected;
    private int growUpStep;

    public Fruit(int areaCrop, int needWater, int price, int growUpStep, boolean isFruitInfected) {
        super(areaCrop, needWater, price);
        this.isFruitInfected = isFruitInfected;

        if (growUpStep > 1) {
            this.growUpStep = growUpStep;
        } else this.growUpStep = 1;
    }

    @Override
    public void growUp() {
        System.out.println(" Fruit Grow Up ");
        if (isFruitInfected && getCropMass() != 0) {

            setCropMass(growUpStep - 1);

            System.out.println("You've lost a bit of a harvest");
        } else setCropMass(growUpStep);

    }
}
