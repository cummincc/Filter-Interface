import java.awt.*;
import java.util.*;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1, 2));  // Perimeter = 6
        rectangles.add(new Rectangle(3, 2));  // Perimeter = 10
        rectangles.add(new Rectangle(5, 1));  // Perimeter = 12
        rectangles.add(new Rectangle(4, 2));  // Perimeter = 12
        rectangles.add(new Rectangle(6, 2));  // Perimeter = 16
        rectangles.add(new Rectangle(1, 1));  // Perimeter = 4
        rectangles.add(new Rectangle(2, 2));  // Perimeter = 8
        rectangles.add(new Rectangle(3, 3));  // Perimeter = 12
        rectangles.add(new Rectangle(5, 5));  // Perimeter = 20
        rectangles.add(new Rectangle(1, 4));  // Perimeter = 10

        BigRectangleFilter filter = new BigRectangleFilter();
        for (Rectangle r : rectangles) {
            if (filter.accept(r)) {
                System.out.println("Big Rectangle: " + r);
            }
        }
    }
}
