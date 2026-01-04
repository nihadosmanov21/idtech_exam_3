package task_4;

public class ElectronicsProduct {

    int productId;
    String name;
    private double price;

    public ElectronicsProduct(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void calculateFinalPrice(int discount) {
        price = price - discount;
        System.out.println("The final price after discount " + price);
    }
}
