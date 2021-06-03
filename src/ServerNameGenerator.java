public class ServerNameGenerator {


    //Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    String[] adj = {"adorable", "adventurous", "aggressive", "agreeable", "alert", "beautiful", "charming", "disturbed", "elegant", "frantic", };

    String[] noun = {"time", "year", "people", "way", "day", "man", "thing", "woman", "life", "child", };

    //Create a method that will return a random element from an array of strings.
    private static String random(String[] strings){
        int randomNumber = (int) (Math.random() * strings.length);
        return strings[randomNumber];
    }

//    public static String makeServerName (String[])






}
