//car details
class JavaProblems {
    String brand;
    String model;
    int year;

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;

        car1.displayDetails();
    }
}

//rectangle area calculation
class JavaProblems {
    double l;
    double w;

    public double area() {
        return l * w;
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.l = 5;
        rec.w = 3;

        System.out.println("Area of Rectangle: " + rec.area());
    }
}

//students details
class JavaProblems {
    String name;
    int rollNumber;
    String grade;

    public JavaProblems() {
        name = "John Doe";
        rollNumber = 101;
        grade = "A";
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        JavaProblems student = new JavaProblems();
        student.displayDetails();
    }
}

//books details
class JavaProblems {
    String title;
    String author;
    double price;

    public JavaProblems(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        JavaProblems book1 = new JavaProblems("Java Programming", "John Smith", 29.99);
        JavaProblems book2 = new JavaProblems("Python Programming", "Jane Doe", 24.99);

        book1.displayDetails();
        book2.displayDetails();
    }
}


//abstraction usin area calcuation
abstract class Java {
    abstract double calculateArea();
}

class Circle extends Java {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Java {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

public class JavaProblems {
    public static void main(String[] args) {
        Java circle = new Circle(5);
        Java square = new Square(4);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
    }
}
