public class Penguin extends Bird{

    //override makeNoises()
    public void makeNoises(){
        System.out.println(this.getName() + " goes Honk Honk!");
    }


    //override move()
    public void move(){
        System.out.println(this.getName() + " goes waddle waddle!");
    }

}
