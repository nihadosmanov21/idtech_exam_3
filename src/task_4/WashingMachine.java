package task_4;

public class WashingMachine extends ElectronicsProduct {
    private int warrantyPeriod;

    public WashingMachine(int productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public void extendsWarranty(int warranty) {
        warrantyPeriod += warranty;
        System.out.println("extended warranty period: " + warrantyPeriod);
    }
}
