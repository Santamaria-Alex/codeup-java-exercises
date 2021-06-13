package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter whatever you want.");
        String input = scanner.nextLine();
        return "You entered: " + input;
    };


    // The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise. //
    public boolean yesNo(){
        System.out.println("Enter yes or no:");
        String inputYN = this.scanner.nextLine();
        return inputYN.trim().equalsIgnoreCase("yes") || (inputYN.trim().equalsIgnoreCase("y"));
    };
        // above "return" is simplified version of bottom "if"
        // if (inputYN.equalsIgnoreCase("yes") || (inputYN.equalsIgnoreCase("y"))) {
        //            return true;
        //        } else {
        //            return false;
        //        }



    //The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
    public int getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d\n", min, max);
        int inputGetInt = this.scanner.nextInt();

        if ((inputGetInt < min) || (inputGetInt > max)) {
            System.out.println("Number entered is out of range, try again.");
            return getInt(min, max);
        } else {
            System.out.println("You entered:");
        }
        return inputGetInt;
    };

    public int getInt(){
        System.out.println("Enter a number:");
        int inputGetInt2 = this.scanner.nextInt();
        System.out.println("You entered: ");
        return inputGetInt2;
    }


    // The getDouble method should do the same thing, but with decimal numbers.
    public double getDouble(double min, double max){
            System.out.printf("Enter a decimal number between %f and %f\n", min, max);
            double inputGetDouble = this.scanner.nextDouble();

            if ((inputGetDouble < min) || (inputGetDouble > max)) {
                System.out.println("Number entered is out of range, try again.");
                return getDouble(min, max);
            } else {
                System.out.println("You entered:");
            }
            return inputGetDouble;
        };

    public double getDouble(){
        System.out.println("Enter a number:");
        double inputGetDouble2 = this.scanner.nextDouble();
        System.out.println("You entered: ");
        return inputGetDouble2;
    }


//    public int getInt2(){
//        try {
//            return Integer.parseInt(getString("Enter a number"));
//        } catch (NumberFormatException e) {
//            System.err.println("Invalid input, try again.");
//            return getInt2();
//        }
//    }

    public int getInt2(){
        String userInput = getString();
        try{
            Integer.valueOf(userInput);
        }catch(NumberFormatException nfe){
            System.out.println("That's not a number!");
            getInt();
        }
        return Integer.parseInt(userInput);
    }











};
