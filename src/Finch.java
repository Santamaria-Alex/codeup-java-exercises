public class Finch extends Bird{

    public void makeNoises(){

        super.makeNoises();
        System.out.println("Tweet Tweet!");
    }

    public Finch(){
        super();
        System.out.println("A finch just got created");
    }


}
