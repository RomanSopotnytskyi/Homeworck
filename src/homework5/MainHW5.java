package homework5;

import java.util.List;

public class MainHW5 {
    public static void main(String[] args) {

        var notificationService = new NotificationService();

        var child1 = new Child("Bil", new Square(2));
        var child2 = new Child("Pit", new Triangle(1,2,3));
        var child3 = new Child("Gun", new Сircle(2));
        var child4 = new Child("Max", new Rectangle(2,2));

        List<Child> children = List.of(child1, child2, child3, child4);

        for(Child child: children) {
            notificationService.send(child);
        }
    }
}
