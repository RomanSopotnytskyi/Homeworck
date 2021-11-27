import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Створити ієрархію фігур (мінімум 4 фігури) і оприділити у них методи для розрахунку площі.
        //Створити клас Child який буде містити фігуру, childs має бути не менше 4 і в кожного з них різні реалізації фігур.

        GeometricFigure figure1= new Square(2);
        GeometricFigure figure2= new Triangle(2,2,2);
        GeometricFigure figure3= new Сircle(2);
        GeometricFigure figure4= new Rectangle(2,2);


        //Написати код який буде виводити назву дитини, її  фігуру і площу цієї фігури.
        List<GeometricFigure> children = List.of(figure1, figure2, figure3, figure4);
        for(GeometricFigure child: children) {
            child.printArea();
        }
    }
}