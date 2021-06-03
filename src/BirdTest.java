public class BirdTest {

    public static void main(String[] args) {
//        Bird cardinal = new Bird();
//        cardinal.setName("Cardinal");
//        cardinal.setCanFly(true);
//        cardinal.makeNoises();
//        cardinal.move();

        // runs the same thing in Bird class even though theres nothing in Duck class because it "extends"
        // everything that's in Bird class extends to Duck class.
        // ONLY IF ITS PUBLIC
        Duck mallard = new Duck();
        mallard.setName("Mallard");
        mallard.makeNoises();


        Finch lesserGoldFinch = new Finch();
        lesserGoldFinch.setName("Lesser Goldfinch");
        lesserGoldFinch.makeNoises();

        Penguin penguin = new Penguin();
        penguin.setName("Emperor Penguin");
        penguin.setCanFly(false);
        penguin.move();
        penguin.makeNoises();

        //polymorphism allow ys to have different reference and object types
        Bird myPenguin = new Penguin();


        Finch houseFinch = new Finch();


    }

}
