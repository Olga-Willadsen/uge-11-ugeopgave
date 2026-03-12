package opgave_2;

public class Circle implements Shape {

    private double radius;

    Circle (double radius){
        this.radius=radius;
    }


    @Override
    public double getArea() {
        return (Math.PI*(this.radius*this.radius));
    }

    @Override
    public double getPerimeter() {
        return (2*this.radius*Math.PI);
    }


    //public String

    //System.out.println(String.format("%.2f",rectangle1.getArea()));

    @Override
    public String toString() {
        return "Circle { " +
                " radius= " + radius +
                " Area= " + (String.format("%.2f", getArea()))+
                " Perimeter= " + (String.format("%.2f", getPerimeter()))+" "+
                '}';
    }


}
