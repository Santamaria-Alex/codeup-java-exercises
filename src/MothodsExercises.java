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
//    public static int getFactorial (){
////        System.out.printf("");
////        Scanner scanner = new Scanner(System.in);
////        int input = scanner.nextInt();
//
//
//
//
//
//
//
//    }



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

