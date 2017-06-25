package Products;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by igor on 23.06.17.
 */
public class Farm {
    private HashSet<Product> products;
    private int money;
    private int areaCrop;
    private int waterCount;
    private int usedArea;

    public Farm(int money, int areaCrop, int waterCount) {
        this.money = money;
        this.areaCrop = areaCrop;
        this.waterCount = waterCount;
        this.products = new HashSet<Product>();
    }

    public HashSet<Product> getProducts() {
        return products;
    }

    public int getUsedArea() {
        return usedArea;
    }

    public int getMoney() {
        return money;
    }

    public int getAreaCrop() {
        return areaCrop;
    }

    public int getWaterCount() {
        return waterCount;
    }


    public Farm addProduct(Product product) {
        if (areaCrop - usedArea > product.getAreaCrop() && !products.contains(product)) {
            products.add(product);
            this.usedArea += product.getAreaCrop();

            System.out.println("product added");

            return this;
        } else System.out.println("area of product too big or product already joined");

        return null;
    }

    public void useWater(Product product) {
        if (product.getNeedWater() < this.waterCount) {
            product.growUp();
            this.waterCount -= product.getNeedWater();

        } else System.out.println("You haven't enough water");

    }

    public void buyWater() {
        if (money > 1) {
            this.money -= 1;
            this.waterCount += 10;

            System.out.println(" 10 liters of water bought ");

        } else System.out.println("You haven't enough money to bought water");
    }

    public void sellProduct(Product product) {
        if (products.contains(product) && product.getCropMass() > 0) {
            this.money += product.getCropMass() * product.getAreaCrop() * product.getPrice();

            System.out.println(" You Sell product and got " + product.getCropMass() * product.getAreaCrop() * product.getPrice() + " money");

            product.setCropMass(product.getCropMass() * -1);

        } else

        {
            System.out.println("you can`t sell product");
        }
    }


    @Override
    public String toString() {
        return "Farm{" +
                "money=" + money +
                ", areaCrop=" + areaCrop +
                ", waterCount=" + waterCount +
                ", usedArea=" + usedArea +
                '}';
    }
}
