package homework5;

public class NotificationService {

    private GeometricFigure figure;

    public void send(Child child) {
        figure = child.figure;
        System.out.print(child.name + " має" );
        figure.PrintArea();
    }

}
