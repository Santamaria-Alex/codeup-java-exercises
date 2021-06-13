import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOlec {

    public static void main(String[] args) throws IOException {

        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }


        // created a "data2" directory inside "src" directory with "data.txt" file inside
        String directory2 = "src/data2";
        String filename2 = "data.txt";

        Path dataDirectory2 = Paths.get(directory2);
        Path dataFile2 = Paths.get(directory2, filename2);

        if (Files.notExists(dataDirectory2)){
            Files.createDirectories(dataDirectory2);
        }

        if (Files.notExists(dataFile2)){
            Files.createFile(dataFile2);
        }


        // create an array list and add it to directory "data 2"
        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
        Path filepath = Paths.get("src/data2", "groceries.txt");
        Files.write(filepath, groceryList);


        // prints items inside "groceries.txt" to the console in a numbered list.
        Path groceriesPath = Paths.get("src/data2", "groceries.txt");
        groceryList = Files.readAllLines(groceriesPath);

        for (int i = 0; i < groceryList.size(); i += 1) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }


        // adds "eggs" to the  groceries.txt
        Files.write(
                Paths.get("src/data2", "groceries.txt"),
                Arrays.asList("eggs"), // list with one item
                StandardOpenOption.APPEND
        );


        // replace "milk" with "cream"
        List<String> lines = Files.readAllLines(Paths.get("src/data2", "groceries.txt"));
        List<String> newList = new ArrayList<>();

        for (String line : lines) {
            if (line.equals("milk")) {
                newList.add("cream");
                continue;
            }
            newList.add(line);
        }

        Files.write(Paths.get("src/data2", "groceries.txt"), newList);





    }
    }












