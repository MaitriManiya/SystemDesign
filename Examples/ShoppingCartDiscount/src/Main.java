public class Main {
    public static void main(String[] args) {
        Product item1=new Item1("FAN", 1000, ProductType.ELECTRONIC);
        Product item2=new Item1("SOFA", 2000, ProductType.FURNITURE);

        ShoppingCart cart= new ShoppingCart();
        cart.addToCart(item1);
        cart.addToCart(item2);

        System.out.println("total price after discount:"+cart.getTotalPrice());
    }
}
//using decorator