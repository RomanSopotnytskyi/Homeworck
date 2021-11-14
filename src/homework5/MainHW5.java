package homework5;

import java.util.List;

public class MainHW5 {
    public static void main(String[] args) {

        //Створити ієрархію фігур (мінімум 4 фігури) і оприділити у них методи для розрахунку площі.

        GeometricFigure figure1= new Square(2);
        GeometricFigure figure2= new Triangle(2,2,2);
        GeometricFigure figure3= new Сircle(2);
        GeometricFigure figure4= new Rectangle(2,2);


        //Створити клас Child який буде містити фігуру, childs має бути не менше 4 і в кожного з них різні реалізації фігур.
        var child1 = new Child("Bil", figure1);
        var child2 = new Child("Pit", figure4);
        var child3 = new Child("Gun", figure2);
        var child4 = new Child("Max", figure3);

        //Написати код який буде виводити назву дитини, її  фігуру і площу цієї фігури.
        List<Child> children = List.of(child1, child2, child3, child4);
        for(Child child: children) {
            child.printInfoAboutChild();
        }
    }
}
