package Products;

/**
 * Created by igor on 23.06.17.
 */
public class Vegetable extends Product {
    private int growUpStep;
    private boolean isGoodWeather;


    public Vegetable(int areaCrop, int needWater, int price, int growUpStep, boolean isGoodWeather) {
        super(areaCrop, needWater, price);
        this.growUpStep = growUpStep;
        this.isGoodWeather = isGoodWeather;

        if (growUpStep > 1) {
            this.growUpStep = growUpStep;
        } else this.growUpStep = 1;
    }

    @Override
    public void growUp() {
        System.out.println(" Vegetable Grow Up ");
        if (this.isGoodWeather) {
            setCropMass(growUpStep * 2);
        } else setCropMass(growUpStep);

    }
}
