public class ControlFlowLecture {
    public static void main(String[] args) {
//        int x = 5;
//        if (x == 5){
//            System.out.println("if you're reading this, it means x is 5.");
//        }
//
//        short y = -5;
//        y = 12;
//        y = 32000;
//
//        if (y<0){
//            System.out.println("the variable y contains a negative number value.");
//        } else if (y>0 && y < 30000){
//            System.out.println("the variable y contains a positive number value");
//        } else {
//            System.out.println("the variable y contains a numeric value that is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }


        // group code, 99 cans of big red
        for (int i = 99; i > 0; i--) {
            String word = "cans";
            if (i == 1) {
                System.out.println(i + " can of Big Red on the Wall,");
                System.out.println(i + " can of Big Red, ");
                System.out.println("Take one down, pass it around");
            } else if (i == 0) {
                System.out.println("No more cans of Big Red on the Wall,");
                System.out.println("No more cans of Big Red, ");
                System.out.println("Go to the store and buy some more, ");
                System.out.println("99 cans of Big Red on the wall. ");
            } else {
                System.out.println(i + " cans of Big Red on the Wall,");
                System.out.println(i + " cans of Big Red, ");
                System.out.println("Take one down, pass it around");
            }
        }}}