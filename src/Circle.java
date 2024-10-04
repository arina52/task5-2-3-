public class Circle {
    private double radius;
     Circle(double radius){
        this.radius = radius;
    }
    public void calculateArea() {
        double suma = 3.14*radius*radius;
        System.out.println("The area of the circle is "+suma);
    }
}
