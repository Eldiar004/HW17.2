public class Circle extends Shape{
    private double PI = 3.14;
    private double a;
    public Circle(double a){
        this.a = a;
    }
    @Override
    public double getPerimetr() {
        return 2*PI*a;
    }
}
