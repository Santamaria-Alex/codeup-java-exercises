import java.util.Scanner;

public class MothodsExercises {


    // Exercise 1 //
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }


    // Exercise 2 //
    public static int getInteger(int min, int max) {
        System.out.printf("Enter number between %d and %d:%n", min, max);
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("Please follow directions, Jack. \n");
            return getInteger(min, max);
        } else {
            System.out.println("You entered: " + userInput);
            return userInput;
        }
    }


    // Exercise 3 //
    public static String getFactorial (long num){
        long factorial = 1L;
        String result = " = ";

        for (long i = 1L; i <= num; i++){
            factorial *= i;
            if (i == num){
                result += i;
            } else {
                result += i + " x ";
            }
        }
        return factorial + result;

    }


    public static void diceRoll(int sides, int numberOfDice){
        for (int i = 1; i <= numberOfDice; i++){
            int result = (int) Math.floor(Math.random() * ((sides - 1) + 1) + 1);
            System.out.println(result);
        }
    }


    public static void diceRoll(){
        boolean keepGoing = true;
        while (keepGoing) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many sides is the die?");
            int sides = scanner.nextInt();
            System.out.println("How many die are you wanting to roll?");
            int numDice = scanner.nextInt();
            diceRoll(sides, numDice);
            scanner.nextLine();
            String answer = " ";
            while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")){
                System.out.println("Keep playing? [yes/no]");
            }
            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thanks for playing.");
                keepGoing = false;
            }
        }
    }



    public static void main(String[] args) {

        // Exercise 1 //
        System.out.println(addition(5,2));
        System.out.println(subtraction(5,2));
        System.out.println(multiply(5,2));
        System.out.println(divide(5,2));

        //Exercise 2 //
        System.out.println(getInteger(1, 10));

//        System.out.printf("Factorial of %d is %d", number, fact);







    }
}



//    String outPut = num + "! = ";
//    long fact = num;
//        for (int i = 1; i < num; ++i) {
//        outPut += i + " x ";
//        fact *= i;
//        }
//        outPut += num + " = " + fact;
//        System.out.println(outPut);

