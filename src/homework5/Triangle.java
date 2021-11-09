package homework5;

public class Triangle extends GeometricFigure {

    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(){
    }

    Triangle(double a, double b, double c){
        sideA = a;
        sideB = b;
        sideC = c;
    }

    @Override
    public double Area (){
        double p = (sideA+sideB+sideC)/2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    @Override
    public void PrintArea(){
        System.out.println(" трикутник з площею - "+ Area());
    }
}
