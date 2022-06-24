package entity;

public class Product {
    private String name;
    private double cost;
    private double rate;

    public Product() {

    }

    public Product(String name, double cost, double rate) {
        this.name = name;
        this.cost = cost;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", rate=" + rate +
                '}';
    }
}
