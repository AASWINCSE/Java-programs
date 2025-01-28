package project;
import java.util.ArrayList;

class ShoppingCart {
    private ArrayList<CartItem> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        for (CartItem item : cartItems) {
            if (item.getProduct().getId() == product.getId()) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        cartItems.add(new CartItem(product, quantity));
    }

    public void removeProduct(int productId) {
        cartItems.removeIf(item -> item.getProduct().getId() == productId);
    }

    public void displayCart() {
        System.out.println("Cart Items:");
        for (CartItem item : cartItems) {
            System.out.println(item);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getTotalPrice();
        }
        return total;
    }
}

