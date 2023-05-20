public class ProductB implements Merchandise {
    private String name;
    private double price;
    private int rating;

    public ProductB(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
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
}
