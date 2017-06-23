package Products;

/**
 * Created by igor on 23.06.17.
 */
public abstract class Product {

    private Farm farm;
    private int areaCrop;
    private int moneyFromSell;


    private int cropMass;
    private int needWater;
    private int price;


    Product(int areaCrop, int needWater, int price) {
        if (areaCrop > 1 && needWater > 1 && price > 1) {
            this.areaCrop = areaCrop;
            this.needWater = needWater;
            this.price = price;
            this.moneyFromSell = 0;
            this.cropMass = 0;
        } else {
            this.areaCrop = 1;
            this.needWater = 1;
            this.price = 1;
            this.moneyFromSell = 0;
            this.cropMass = 0;
        }
    }

    public void setCropMass(int cropMassStep) {
        if (this.cropMass + cropMassStep > 0) {
            this.cropMass += cropMassStep;
        } else System.out.println("invalid crop Mass Step");
    }

    public int getNeedWater() {
        return needWater;
    }

    public void setFarm(Farm farm) {
        this.farm = farm.addProduct(this);
    }

    public int getAreaCrop() {
        return areaCrop;
    }

    public int getCropMass() {
        return cropMass;
    }

    public void sellProduct() {

        if (getCropMass() > 0) {
            this.moneyFromSell += price * areaCrop * cropMass;

            System.out.println("you sell product and got " + price * areaCrop * cropMass + " money. Don`t forget collect money");

            this.cropMass = 0;

        } else System.out.println("crop mass = 0. can`t  sell the product ");
    }

    int transferMoney(Farm farm) {
        if (this.farm.equals(farm)) {
            int temp = moneyFromSell;
            this.moneyFromSell = 0;

            return temp;
        }
        return 0;

    }

    public abstract void growUp();

    @Override
    public String toString() {
        return "Product{" +
                "areaCrop=" + areaCrop +
                ", moneyFromSell=" + moneyFromSell +
                ", cropMass=" + cropMass +
                ", needWater=" + needWater +
                ", price=" + price +
                '}';
    }
}
