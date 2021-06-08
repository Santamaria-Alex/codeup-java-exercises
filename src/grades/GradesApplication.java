package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, String> students = new HashMap<>();
        students.put("Alex", "Cryptic_Shogun");
        students.put("Alexis", "Shogunator");
        students.put("Santamaria", "The Nina, the Pinta");
        students.put("Hasbulla", "GOAT");


        System.out.println(students);

    }

}
