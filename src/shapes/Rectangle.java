package shapes;

public class Rectangle {

    // It should have protected properties for both length and width.
    protected int length;
    protected int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
    public Rectangle (int length, int width){
        this.setLength(length);
        this.setWidth(width);
    }




    //Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.
    public int getArea(){
        return this.getLength() * this.getWidth();
    }

    public int getPerimeter(){
        return (2 * this.getLength()) + (2 * this.getWidth());
    }


}
