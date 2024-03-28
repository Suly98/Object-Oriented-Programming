import java.util.Scanner;

public class Rectangle {
    private Integer length;
    private Integer width;


    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Rectangle(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle(sc.nextInt(), sc.nextInt());

        int area = rectangle.getLength() * rectangle.getWidth();

        System.out.println("The area of the rectangle is: " + area);
    }
}

