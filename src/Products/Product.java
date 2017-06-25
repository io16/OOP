package Products;

/**
 * Created by igor on 23.06.17.
 */
public abstract class Product {


    private int areaCrop;


    private int cropMass;
    private int needWater;
    private int price;


    Product(int areaCrop, int needWater, int price) {
        if (areaCrop > 1 && needWater > 1 && price > 1) {
            this.areaCrop = areaCrop;
            this.needWater = needWater;
            this.price = price;
            this.cropMass = 0;
        } else {
            this.areaCrop = 1;
            this.needWater = 1;
            this.price = 1;
            this.cropMass = 0;
        }
    }

    public void setCropMass(int cropMassStep) {
        if (this.cropMass + cropMassStep >= 0) {
            this.cropMass += cropMassStep;
        } else System.out.println("invalid crop Mass Step");
    }

    public int getPrice() {
        return price;
    }

    public int getNeedWater() {
        return needWater;
    }



    public int getAreaCrop() {
        return areaCrop;
    }

    public int getCropMass() {
        return cropMass;
    }


    public abstract void growUp();

    @Override
    public String toString() {
        return "Product{" +
                "areaCrop=" + areaCrop +
                ", cropMass=" + cropMass +
                ", needWater=" + needWater +
                ", price=" + price +
                '}';
    }
}
