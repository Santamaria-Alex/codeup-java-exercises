import java.util.Scanner;

public class MethodsLecture {

    public static void sayHello(String name){
        System.out.printf("Hello, I'm %s.\n", name);
    }

    public static int multiply (int num1, int num2){
        return num1 * num2;
    }

    public static void willYouTakeUsToMtSplashmore(Scanner scanner){
        System.out.println("Will you take us to Mt. Rushmore?");
        if (!scanner.nextLine().equalsIgnoreCase("yes")){
            willYouTakeUsToMtSplashmore(scanner);
        } else {
            System.out.println("Thanks Dad, you're the best.");
        }
    }


    public static void bottlesOfBlank(String beverage, int numBottles){
        if (numBottles == 0){
            System.out.printf("No more bottles of %s on the wall%nNo more bottles of %s%nStand up now, stumble around%nAll of the bottles of %s on the wall%n", beverage, beverage, beverage);
        } else if (numBottles == 1){
            System.out.printf("1 bottle of %s on the wall%n1 bottle of %s%nTake it down, pass it around%nNo more bottles of %s on the wall%n", beverage, beverage, beverage);
            bottlesOfBlank(beverage, numBottles - 1);
        } else if (numBottles == 2){
            System.out.printf("1 bottle of %s on the wall%n1 bottle of %s%nTake it down, pass it around%nNo more bottles of %s on the wall%n", beverage, beverage, beverage);
            bottlesOfBlank(beverage, numBottles - 1);
        } else {
            System.out.printf("%d bottles of %s on the wall%n%d bottle of %s%nTake it down, pass it around%n%d bottles of %s on the wall%n", numBottles, beverage, numBottles, beverage, numBottles - 1, beverage);
            bottlesOfBlank(beverage, numBottles - 1);
        }
    }


    public static void main(String[] args) {
        sayHello("Alex");

        System.out.println(multiply(5,2));

        int product = multiply(7,3);
        System.out.printf("did you know that %d X %d ='s %d \n", product, product, product * product);


        willYouTakeUsToMtSplashmore(new Scanner(System.in));

        bottlesOfBlank("Surge", 5);
    }
}
