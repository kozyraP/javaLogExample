package lessons;

import java.util.logging.Logger;

public class Shop {
    private static final Logger log = Logger.getLogger(Shop.class.getName());

    public Shop() {
        log.info("In the Shop constructor");

        Product product = new Product(2.3, "Chleb", 5);
        printProduct(product);
        Product product2 = new Product(12.3, "Ser", 2);
        printProduct(product2);
        Product product3 = new Product(5.2, "Masło", 1);
        printProduct(product3);
    }

    private void printProduct(Product product) {
        log.info("In the printProduct method");
        System.out.printf("Produkt nr %d \n" +
                        "Opis: %s \n" +
                        "Cena: %f \n" +
                        "Dostepnych sztuk: %d \n",
                product.getId(), product.getDescription(), product.getPrice(), product.getItemsNumber());
    }
}
