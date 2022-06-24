package entity;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User() {

    }

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }

    public static void main(String[] args) {
        User user1 = new User("timofeiroslik@gmail.com", "trap2020", new Basket(new String[]{"pork," +
                " bananas"}));
        User user2 = new User("rybak@gmail.com", "trap2021", new Basket(new String[]{"apples, " +
                "beef"}));
        User user3 = new User("malyshka@gmail.com", "trap2022", new Basket(new String[]{"lamb," +
                " pineapples"}));
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
        System.out.println("user3 = " + user3);

    }



}
