public class Main {
    public static void main(String[] args) {
        Merchandise productA = new ProductA("Product A", 10.99, 4);
        Merchandise productB = new ProductB("Product B", 19.99, 5);
        Merchandise productC = new ProductC("Product C", 5.99, 3);
        System.out.println(productC.getName());
        User usera = new UserA("usera", "1234");
        User userb = new UserB("userb", "pwd");
        User userc = new UserC("userc", "qwerty");
        System.out.println(userc.getLogin());
        ProductUser productUser = new ProductUser("Product D", 7.99, 4, "user1", "password123");
        productUser.buyProduct();
    }
}
