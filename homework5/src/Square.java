public class Square extends GeometricFigure{
    //квадрат
    private double sideA;

    Square(){
    }

    Square(double a){
        sideA = a;
    }

    @Override
    public double area (){
        return Math.pow(sideA, 2);
    }

    @Override
    public void printArea(){
        System.out.println(" квадрат з площею - "+ area());
    }
}