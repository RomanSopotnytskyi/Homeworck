package homework5;

public class Сircle extends GeometricFigure{

    private double radius;

    Сircle(){
    }

    Сircle(double r){
        radius = r;
    }

    public double Area (){
        return Math.PI*radius*radius;
    }

    public void PrintArea(String name){
        System.out.println(name + " його фігура коло з площею - "+ Area());
    }
}
