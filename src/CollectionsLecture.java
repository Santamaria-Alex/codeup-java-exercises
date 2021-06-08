import java.util.ArrayList;

public class CollectionsLecture {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        ArrayList<Integer> collectionOfNums = new ArrayList<>();
        collectionOfNums.add(16);
        collectionOfNums.add(44);
        collectionOfNums.add(32);
        collectionOfNums.add(1, 24);


        for (Integer collectionOfNum : collectionOfNums) {
            System.out.println(collectionOfNum);
        }

        System.out.println(collectionOfNums);

    }


}
