package OopLecture;

import java.util.Scanner;

public class Car {
    public static Scanner scanner = new Scanner(System.in);
    public String model;
    public int year;
    public String color;
    public void run() {
        System.out.println("The car is running.");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);

        car1.color = "Black";
        car1.year = 2020;
        car1.model = "Toyota Camry" ;

        System.out.println(car1.color);

        Car car2 = new Car();

        car2.color = "Blue";
        car2.year = 2020;
        car2.model = "Kia Rio";
        car2.run();
    }












}
