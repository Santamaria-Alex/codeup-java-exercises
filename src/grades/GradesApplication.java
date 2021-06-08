package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        students.put("Cryptic_Shogun", new Student("Alex"));
        students.get("Cryptic_Shogun").addGrade(100);
        students.get("Cryptic_Shogun").addGrade(80);

        students.put("Shogunator", new Student("Alexis"));
        students.get("Shogunator").addGrade(80);
        students.get("Shogunator").addGrade(70);

        students.put("The Nina the Pinta", new Student("Santamaria"));
        students.get("The Nina the Pinta").addGrade(70);
        students.get("The Nina the Pinta").addGrade(60);

        students.put("GOAT", new Student("GOAT"));
        students.get("GOAT").addGrade(50);
        students.get("GOAT").addGrade(40);

        System.out.println("Usernames:");
        System.out.println(students.keySet());

        boolean confirm = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Select username to view information:");
            String userInput = scanner.nextLine();
            if (!students.containsKey(userInput)){
                System.out.println("User does not exist, re-enter username:");
            } else if (students.containsKey(userInput)){
                Student userInputResult = students.get(userInput);
                System.out.println("Username: " + userInput + "\nStudent: " + userInputResult.getName() + "\nGrade Average: " + userInputResult.getGradeAverage());

                System.out.println("Do you want to see another student's information? [Y/N]");
                String userInput2 = scanner.nextLine();
                if (userInput2.equalsIgnoreCase("y")){
                    System.out.println("Users: ");
                    System.out.println(students.keySet());
                }
                if (!userInput2.equalsIgnoreCase("y")){
                    System.out.println("See ya.");
                    break;
                }
            }
        } while (confirm);



    }

}
