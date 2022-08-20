public class Romb extends Shape{
    private int d;
    public Romb(int d){
        this.d = d;
    }
    @Override
    public double getPerimetr() {
        return d+d+d+d;
    }
}
