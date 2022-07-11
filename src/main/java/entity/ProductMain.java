package entity;

public class ProductMain {
    public static void main(String[] args) {
        Category category1 = new Category("Fruits:", new Product[]{new Product("Bananas",3.67,5.0),
                new Product("Orange", 3.03,4.5)});
        Category category2 = new Category("Vegetables:",new Product[]{new Product("Tomatoes",5.70,
                4.0 ), new Product("Cucumbers", 4.3,4.8)});
        Category category3 = new Category("Meat:", new Product[] {new Product("Pork",13.67,4.85),
                new Product("Beef", 10.33,4.75)});
        System.out.println("category1 - " + category1);
        System.out.println("category2 - " + category2);
        System.out.println("category3 - " + category3);
        User user1 = new User("timofeiroslik@gmail.com", "trap2020", new Basket( new Product[]
                {new Product("Bananas",3.67,5.0), new Product("Pork",13.67,4.85)}));
        User user2 = new User("rybak@gmail.com", "trap2021",  new Basket( new Product[]
                {new Product("Orange",3.03,4.5), new Product("Pork",13.67,4.85)}));
        User user3 = new User("malyshka@gmail.com", "trap2022",  new Basket( new Product[]
                {new Product("Tomatoes",5.70,4.0), new Product("Beef",10.33,4.75)}));
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
        System.out.println("user3 = " + user3);


    }
}
