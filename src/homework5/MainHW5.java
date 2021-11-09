package homework5;

import java.util.List;

public class MainHW5 {
    public static void main(String[] args) {

        //Створити ієрархію фігур (мінімум 4 фігури) і оприділити у них методи для розрахунку площі.
        GeometricFigure [] figure = new GeometricFigure [4];

        figure[0]= new Square(2);
        figure[1]= new Triangle(2,2,2);
        figure[2]= new Сircle(2);
        figure[3]= new Rectangle(2,2);

        for(int i=0; i<figure.length; i++)
            figure[i].PrintArea();

        System.out.println();

        //Створити клас Child який буде містити фігуру, childs має бути не менше 4 і в кожного з них різні реалізації фігур.
        var child1 = new Child("Bil", figure[1]);
        var child2 = new Child("Pit", figure[0]);
        var child3 = new Child("Gun", figure[2]);
        var child4 = new Child("Max", figure[3]);

        //Написати код який буде виводити назву дитини, її  фігуру і площу цієї фігури.
        var notificationService = new NotificationService();
        List<Child> children = List.of(child1, child2, child3, child4);
        for(Child child: children) {
            notificationService.send(child);
        }
    }
}
