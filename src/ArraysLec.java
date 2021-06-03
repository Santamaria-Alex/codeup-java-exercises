import java.util.Arrays;

public class ArraysLec {

    public static void main(String[] args) {
        int[] numbers = {14, 64, 34, 44};
//        for (int j : numbers) {
//            System.out.println(j);
//        }


        String[] topFiveExampleNames = new String[6];

        topFiveExampleNames[0] = "Greg";
        topFiveExampleNames[1] = "Jim";
        topFiveExampleNames[2] = "Geoff";
        topFiveExampleNames[3] = "Michael";
        topFiveExampleNames[4] = "Scott";

//        for (String name : topFiveExampleNames){
//            System.out.println(name);
//        } // prints all names and null for empty

        boolean[] lookingAtDefaultValues = new boolean[3];
//        for (boolean boo : lookingAtDefaultValues){
//            System.out.println(boo);
//        } // false false false

        Arrays.fill(topFiveExampleNames, "Dwight");
//        topFiveExampleNames[0] = "Naysa";
        for (String name : topFiveExampleNames){
            System.out.println(name);
        }


        char[][] letters = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };

        for (char[] row : letters) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (char n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }
        System.out.println("+---+---+---+");













    }


}
