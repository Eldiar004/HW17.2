public class Main {
    public static void main(String[] args){
        Kvadrat kvadrat = new Kvadrat(5);
        System.out.println(kvadrat.getPerimetr());
        Triangle triangle = new Triangle(3);
        System.out.println(triangle.getPerimetr());
        Circle circle = new Circle(12);
        System.out.println(circle.getPerimetr());
        Romb romb = new Romb(15);
        System.out.println(romb.getPerimetr());
        Pentagon pentagon = new Pentagon(5);

    }
}