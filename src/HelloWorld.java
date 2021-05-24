public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.print(", World!");

        byte smallNumber = 34;
        System.out.println(smallNumber);

        short notASmallNumber = 30000;

        int num = 450000000;

        long largeNumber = 14;

        System.out.println(largeNumber);

        float decimal = 1.5F;
        System.out.println(decimal);

        double bigDecimal = 45;
        System.out.println(bigDecimal);

        char singleLetter = 'g';

        boolean amILearningJava = true;

        String message = "How's it?\n Everything \"good?\"\n\t Java ain't all that, huh?";
        System.out.println(message);

        int sum = 4 + 5;
        System.out.println(sum);

        int difference = 72 - 19;

        int product = 11 * 9 ;
        System.out.println(product);

        int quotient = product / sum;
        System.out.println(quotient);

        int remainder = difference % sum;
        System.out.println(remainder);

        int whatWillThisBe = -4 * 2;
        System.out.println(whatWillThisBe);

        System.out.println(sum++);
        System.out.println(sum);

        int iAmAnInt = 44;
        int iAmALong = iAmAnInt;
        System.out.println(iAmALong);

        iAmALong = 99;
        iAmAnInt = (int) iAmALong;
        System.out.println(iAmAnInt);

        int myFavoriteNumber = 10;
        System.out.println(myFavoriteNumber);

        String myString = "Shogun";
        System.out.println(myString);

        long myNumber = 123;

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(o);

//

        x += 5;
        System.out.println(x);

        int y = 3;

    }
}
