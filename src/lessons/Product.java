package lessons;

import java.util.logging.Logger;

public class Product {
    private static final Logger log = Logger.getLogger(Product.class.getName());

    private static int GLOBAL_ID = 0;
    private int id;
    private double price;
    private String description;
    private int itemsNumber;

    public Product(double price, String description, int itemsNumber) {
        this.price = price;
        this.description = description;
        this.itemsNumber = itemsNumber;
        this.id = setId();
        log.info(() -> "Create Product with " + getId() + " ID");
    }

    public int getId() {
        log.info("in the getId method");
        return id;
    }

    public double getPrice() {
        log.info("in the getPrice method");
        return price;
    }

    public void setPrice(double price) {
        log.info("in the setPrice method");
        this.price = price;
    }

    public String getDescription() {
        log.info("in the getDescription method");
        return description;
    }

    public void setDescription(String description) {
        log.info("in the setDescription method");
        this.description = description;
    }

    public int getItemsNumber() {
        log.info("in the getItemsNumber method");
        return itemsNumber;
    }

    public void setItemsNumber(int itemsNumber) {
        log.info("in the setItemsNumber method");
        this.itemsNumber = itemsNumber;
    }

    private int setId() {
        log.info("in the setId method");
        return ++GLOBAL_ID;
    }
}
