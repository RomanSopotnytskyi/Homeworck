package homework5;

public class Child {

    public String name;
    public GeometricFigure figure;

    public Child(String name, GeometricFigure f) {
        this.name = name;
        this.figure = f;
    }

    public void printInfoAboutChild() {
        System.out.print(this.name + " має" );
        figure.printArea();
    }

}
