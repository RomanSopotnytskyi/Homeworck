package homework4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Заповнити масив тільки парними числами
        int [] tmp = new int[10];
        for(int i = 0; i < tmp.length; i++){
            tmp[i] = i*2;
        }

        ActionsWithArray x = new ActionsWithArray(tmp);
        System.out.print("масив парних чисел - ");
        x.printArray();

        ActionsWithArray a = new ActionsWithArray(10);

        //Заповнити масив рандомними числами
        System.out.print("масив випадкових чисел - ");
        a.arrRandom();
        a.printArray();

        //Вивести середнє значення масиву
        System.out.println("середнє значення масиву випадкових чисел = " + a.arithmeticMean());

        //Вивести найменше значення в масиві
        System.out.println("мінімальне значення - " + a.minElemArray());

        //Вивести найбільше значення масиву
        System.out.println("максимальне значення - " + a.maxElemArray());

        //Вивести значення парних індексів масиву
        System.out.print("значення парних індексів масиву - ");
        a.printCoupleIndex();

        //Виведення символів з таблиці ASCI
        x.initArrayASCI();

        x.printArreyASCI();
    }
}
