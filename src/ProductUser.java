public class ProductUser implements Merchandise, User {
    private String name;
    private double price;
    private int rating;
    private String login;
    private String password;

    public ProductUser(String name, double price, int rating, String login, String password) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.login = login;
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void buyProduct() {
        System.out.println("User " + login + " has bought " + name);
    }
}
