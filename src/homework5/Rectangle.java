package homework5;

public class Rectangle extends GeometricFigure{

    private double sideA;
    private double sideB;

    Rectangle(){
    }

    Rectangle(double a, double b){
        sideA = a;
        sideB = b;
    }

    public double Area (){
        return sideA*sideB;
    }

    public void PrintArea(String name){
        System.out.println(name + " його фігура прямокутник з площею - "+ Area());
    }
}
