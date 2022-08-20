public class Pentagon extends Shape{
    private int d;
    public Pentagon(int d){
        this.d = d;
    }
    @Override
    public double getPerimetr() {
        return d+d+d+d+d;
    }
}
