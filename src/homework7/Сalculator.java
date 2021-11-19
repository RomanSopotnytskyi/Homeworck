package homework7;

public class Сalculator {

    private int a;
    private int b;

    public Сalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() throws MyException {
        if ((a < 0) || (b < 0)) throw new MyException("a or b - не натуральне число");
        return a + b;
    }

    public int subtract() throws MyException {
        if ((a < 0) && (b < 0)) throw new MyException("a or b - не натуральне число");
        return a - b;
    }

    public double multiply() throws MyException {
        if ((a < 0) && (b < 0)) throw new MyException("a or b - не натуральне число");
        return a * b;
    }

    public double devide() throws MyException {
        if ((a < 0) && (b < 0)) throw new MyException("a or b - не натуральне число");
        if (b == 0) throw new MyException("не можна ділити на 0");
        return a / b;
    }
}

