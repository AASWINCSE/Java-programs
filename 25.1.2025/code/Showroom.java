class Showroom {
    void showVehicles(String type) {
        System.out.println("Showing " + type + " vehicles.");
    }

    void showVehicles(int count) {
        System.out.println("Showing " + count + " vehicles.");
    }

    void showVehicles(String type, int count) {
        System.out.println("Showing " + count + " " + type + " vehicles.");
    }

    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        showroom.showVehicles("Car");
        showroom.showVehicles(10);
        showroom.showVehicles("Bike", 5);
    }
}
