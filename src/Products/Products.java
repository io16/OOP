package Products;

/**
 * Created by igor on 23.06.17.
 */
public class Products {
    public static void main(String[] args) {
        Farm farm = new Farm(100, 250, 100);

        Product potato = new Vegetable(100, 10, 10, 1, true);
        Product orange = new Fruit(100, 30, 25, 1, true);

        farm.addProduct(potato);
        farm.addProduct(orange);

        System.out.println("Product Status");
        System.out.println(potato.toString());
        System.out.println(orange.toString());

        farm.sellProduct(potato); //    System.out.println("you can`t sell product");

        System.out.println("Farm Status");
        System.out.println("Before  ");
        System.out.println(farm.toString());

        farm.useWater(orange);
        farm.useWater(potato);

        farm.sellProduct(orange);
        farm.sellProduct(potato);


        System.out.println("After  ");
        System.out.println(farm.toString());

        farm.buyWater();


        System.out.println(farm.toString());
    }
}
