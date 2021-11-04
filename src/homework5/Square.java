package homework5;

public class Square extends GeometricFigure{
    //квадрат
    private double sideA;

    Square(){
    }

    Square(double a){
        sideA = a;
    }

    public double Area (){
        return Math.pow(sideA, 2);
    }

    public void PrintArea(String name){
        System.out.println(name + " його фігура квадрат з площею - "+ Area());
    }
}
