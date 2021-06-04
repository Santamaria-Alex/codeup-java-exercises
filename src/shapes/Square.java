package shapes;

public class Square extends Rectangle{

    // Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
    public Square (int side){
        // super calls the parent's constructor
        super(side, side);
    }

    private int side;

    // getter
    public int getSide() {
        return side;
    }

    //setter
    public void setSide(int side) {
        this.side = side;
    }

    public int getArea(){
        this.setSide(this.getWidth());
        return this.getSide() * this.getSide();
    }

    public int getPerimeter(){
        this.setSide(this.getWidth());
        return 4 * this.getSide();
    }





}
