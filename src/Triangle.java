public class Triangle extends Shape{
    private int a;
    public Triangle(int a){
        this.a = a;
    }

    @Override
    public double getPerimetr() {
        return a + a + a;
    }
}
