import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s.%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number.");
        int num = scanner.nextInt();
        System.out.printf("Your number: %d%n", num);

        System.out.println("Print 3 words");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println("Your 3 words are: \n" + word1 + "\n" + word2 + "\n" + word3);

        System.out.println("Print a sentence");
        String sentence = scanner.nextLine();
        System.out.println(sentence);
    }
}
