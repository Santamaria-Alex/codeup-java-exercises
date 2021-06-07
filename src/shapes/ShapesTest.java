package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("Box 1:");
//        System.out.println("Length: " + box1.getLength() + ". Width: " + box1.getWidth());
//        System.out.println("Perimeter: " + box1.getPerimeter() + ". Area: " + box1.getArea());
//
//
//        // this is polymorphism, putting square inside of rectangle.
//        Rectangle box2 = new Square(5);
//        System.out.println("Box 2:");
//        System.out.println("Length: " + box2.getLength() + ". Width: " + box2.getWidth());
//        System.out.println("Perimeter: " + box2.getPerimeter() + ". Area: " + box2.getArea());

        Measurable myShape = new Rectangle(4, 5);
//        Measurable myShape = new Square(5);

        System.out.println(myShape.getArea()); //should expect 20

    }


}
