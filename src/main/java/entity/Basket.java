package entity;

import java.util.Arrays;

public class Basket {
    private String[] purchasedProducts;

    public Basket() {

    }

    public Basket(String[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public String[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(String[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "purchasedProducts=" + Arrays.toString(purchasedProducts) +
                '}';
    }
}
