package homework5;

public class Сircle extends GeometricFigure{

    private double radius;

    Сircle(){
    }

    Сircle(double r){
        radius = r;
    }

    @Override
    public double Area (){
        return Math.PI*radius*radius;
    }

    @Override
    public void PrintArea(){
        System.out.println(" коло з площею - "+ Area());
    }
}
