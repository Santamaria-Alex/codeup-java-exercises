public class ServerNameGenerator {


    //Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    private static String [] adj = {"adorable", "adventurous", "aggressive", "agreeable", "alert", "beautiful", "charming", "disturbed", "elegant", "frantic", };

    private static String[] noun = {"time", "year", "people", "way", "day", "man", "thing", "woman", "life", "child", };

    //Create a method that will return a random element from an array of strings.
    private static String random(String[] strings){
        int randomNumber = (int) (Math.random() * strings.length);
        return strings[randomNumber];
    }

//    public static String makeServerName (String[])
    public static String makeServerName (String[] arr1, String[] arr2){
        String adj = random(arr1);
        String noun = random(arr2);
        return adj + "-" + noun;
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(makeServerName(adj, noun));
    }





}
