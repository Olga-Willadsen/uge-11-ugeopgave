package opgave_2;

public class Square implements Shape {

    private double side;


    Square(Double side){
        this.side=side;
    }


    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }


}
