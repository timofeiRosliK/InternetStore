package entity;

import java.util.Arrays;

public class Category {
    private String name;
    private String[] products;

    public Category() {

    }

    public Category(String name, String[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    public static void main(String[] args) {
        Category category1 = new Category("Fruits:", new String[]{"Bananas, Apples, Pineapples"});
        Category category2 = new Category("Vegetables:",new String[]{"Tomatoes, Cucumbers, Potatoes"});
        Category category3 = new Category("Meat:", new String[]{"Pork, beef, lamb"});
        System.out.println("category1 - " + category1);
        System.out.println("category2 - " + category2);
        System.out.println("category3 - " + category3);
    }
}
