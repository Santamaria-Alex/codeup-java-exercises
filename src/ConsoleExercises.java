import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // Ex. 1 //
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        // Ex. 2.1 //
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number:");
        int num = scanner.nextInt();
        System.out.printf("Your number: %d%n", num);

        // Ex 2.2 //
        System.out.println("Print 3 words");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println("Your 3 words are: \n" + word1 + "\n" + word2 + "\n" + word3);

        // Ex 2.3 //
        System.out.println("Print a sentence");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.printf("You entered the sentence: %s%n", sentence );

        // Ex 3. Calculate the perimeter and area of Codeup's classroom //
        System.out.println("Enter a length in meters:");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.printf("Length entered: %d meters. %nEnter a width in meters: %n", length);
        int width = Integer.parseInt(scanner.nextLine());
        int area = length * width;
        int perimeter = (2 * length) + (2 * width);
        System.out.printf("Length entered: %d meters. %nWidth entered: %d meters. %nThe area of the room is: %d meters. %nThe perimeter of the room is: %d meters.", length, width, area, perimeter);
    }
}
