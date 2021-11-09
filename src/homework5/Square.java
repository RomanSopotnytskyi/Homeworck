package homework5;

public class Square extends GeometricFigure{
    //квадрат
    private double sideA;

    Square(){
    }

    Square(double a){
        sideA = a;
    }

    @Override
    public double Area (){
        return Math.pow(sideA, 2);
    }

    @Override
    public void PrintArea(){
        System.out.println(" квадрат з площею - "+ Area());
    }
}
