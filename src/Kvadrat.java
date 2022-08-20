public class Kvadrat extends Shape{
    private int a;

    public Kvadrat(int a){
        this.a = a;
    }
    @Override
    public double getPerimetr() {
        return a+a+a+a;
    }
}
