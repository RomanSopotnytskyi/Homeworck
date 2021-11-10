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
    public double area (){
        return sideA*sideB;
    }

    @Override
    public void printArea(){
        System.out.println(" прямокутник з площею - "+ area());
    }
}
