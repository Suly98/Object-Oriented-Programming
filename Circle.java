import java.util.Scanner;

public class Circle {

    private Float radius;
    private String color;

    public Float getRadius(){
        return radius;
    }

    public void setRadius(){
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(Float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Radius: ");
        Circle circle = new Circle(sc.nextFloat(), "Green");

        Double area= Math.PI* Math.pow(circle.radius, 2);
        System.out.println("Area of Circle is: "+ area);

    }
}

