import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        RectangleClass rec = new RectangleClass(width, height);
        System.out.println("Your Rectangle \n" + rec.display());
        System.out.println("Perimeter of the Rectangle: " + rec.getPerimeter());
        System.out.println("Area of the Rectangle: " + rec.getArea());
    }
}