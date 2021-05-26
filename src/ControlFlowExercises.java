import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        ////////// Exercise 1.a ////////////
//        int i = 5;
//        while (i <= 15){
//            if (i < 15) {
//                System.out.println(i + " ");
//            } else {
//                System.out.println(i);
//            }
//            i++;
//        }

        ////////// Exercise 1.b ////////////
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);


//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

        //////// Exercise 1.c ///////////

//        for (int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i *= i){
//            System.out.println(i);
//        }


        ///////// /*You have to design the code such that the user has only three tries to guess the correct pin of the account. You set the pin as a constant with a final attribute. When correct display "Correct, welcome back." When incorrect display "Incorrect, try again.". When user runs out of tries display "Sorry but you have been locked out."
        //program Starts:
        //Please enter pin:
        //22132
        //Output:
        //Incorrect, try again.
        //Please enter pin:
        //23412
        //Output:
        //Incorrect, try again.
        //Please enter pin:
        //12345
        //Output:
        //Correct, welcome back.
        // */

//        Scanner scanne1 = new Scanner(System.in);
//        final int PIN = 12345;
//        int userInput = 0;
//        int attempts = 1;
//        while (attempts <= 3){
//            System.out.println("Please enter pin: ");
//            userInput = scanne1.nextInt();
//            if (userInput != PIN){
//                if (attempts < 3) {
//                    System.out.println("WRONG, try again: ");
//                } else {
//                    System.out.println("Sorry you've been locked out.");
//                }
//            } else {
//                System.out.println("Correct, welcome back.");
//                break;
//            }
//            attempts++;
//        }


        //////// Exercise 3 ////////
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer to go up to: ");
//        boolean userWantsToContinue = false;
//
//        do {
//            int userInput = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userInput; i++) {
//                System.out.printf("%-7d| %-8d| %-5d%n", i, i * i, i * i * i);
//            }
//            System.out.println("Enter another number? y/n");
//            String userAnswer = scanner.next();
//            if (userAnswer.equals("y")){
//                userWantsToContinue = true;
//            }
//            System.out.println("What number would you like to go up to?");
//        } while (userWantsToContinue);


        /////////// Exercise 4 ////////////
        Scanner scanner = new Scanner(System.in);
        String userChoice = "y";
        while (!userChoice.equals("n")){
            System.out.println("Enter the student's numerical grade: ");
            byte grade = scanner.nextByte();
            char letterGrade;
            if (grade > 0 && grade <= 59){
                letterGrade = 'F';
            } else if (grade >59 && grade <= 66){
                letterGrade = 'D';
            } else if (grade >67 && grade <= 79){
                letterGrade = 'C';
            } else if (grade >80 && grade <= 87){
                letterGrade = 'B';
            } else {
                letterGrade = 'A';
            }
            System.out.println("The letter grade is: " + letterGrade);
            System.out.println("Would you like to enter another grade? (y/n)");
            userChoice = scanner.next();
        }















    }
}
