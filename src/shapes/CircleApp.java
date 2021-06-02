package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("What's the radius of the circle?");
        Input input = new Input();

        Circle circle2 = new Circle(input.getDouble());

        System.out.println("The area of the circle is: " + circle2.getArea());
        System.out.println("The circumference of the circle is: " + circle2.getCircumference());


    }
}
