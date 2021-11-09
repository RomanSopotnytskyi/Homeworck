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

    @Override
    public double Area (){
        return sideA*sideB;
    }

    @Override
    public void PrintArea(){
        System.out.println(" прямокутник з площею - "+ Area());
    }
}
