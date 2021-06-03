public class Bird {

    //can it fly? ---- instance variable
    private boolean canFly;

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }



    //what kind of bird? ------- instance variable
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoises(){
        System.out.println(this.getName() +  " goes Tweet tweet");
    }

    public void move(){
        System.out.println("Flap flap");
    }

    public Bird(){
        System.out.println("A Bird just got created");
    }








}
