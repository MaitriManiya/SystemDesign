import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productList;
    public ShoppingCart(){
        productList= new ArrayList<>();
    }

    public void addToCart(Product product){
        Product productWithELigibleDiscount= new TypeCouponDecorator(new PercentageCouponDecorator(product, 5),10,product.type);
    }

    public int getTotalPrice(){
        int totalPrice=0;
        for(Product product:productList){
            totalPrice+=product.getPrice();
        }
        return totalPrice;
    }
}
