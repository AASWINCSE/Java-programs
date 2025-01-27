class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

class Electronics extends Product {
    int warranty;

    public Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Warranty: " + warranty + " years");
    }
}

class Clothing extends Product {
    String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Size: " + size);
    }

    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 1000, 2);
        Clothing shirt = new Clothing("Shirt", 30, "M");

        laptop.showDetails();
        shirt.showDetails();
    }
}
