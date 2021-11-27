public class Сircle extends GeometricFigure{

    private double radius;

    Сircle(){
    }

    Сircle(double r){
        radius = r;
    }

    @Override
    public double area (){
        return Math.PI*radius*radius;
    }

    @Override
    public void printArea(){
        System.out.println(" коло з площею - "+ area());
    }
}