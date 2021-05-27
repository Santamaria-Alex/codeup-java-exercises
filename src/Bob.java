import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yo, I'm Bob, heard you wanted to speak to me...");
        String response = "";

        while (!response.equalsIgnoreCase("QUIT")){
            System.out.println("What's up?");
            response = scanner.nextLine();
            if (response.isEmpty()) {
                System.out.println("Cool man, whatever.");
            } else if (response.endsWith("?")){
                System.out.println("Sure.");
            } else if (response.endsWith("!")){
                System.out.println("Whoa, chill mayne!");
            } else {
                System.out.println("Whatever.");
            }
        }
        System.out.println("I'm out homie.");




    }
}
