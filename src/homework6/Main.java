package homework6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        Queue list1 = new Queue();

        //Заповонити List  рандомними числами
        list1.initializationListRandomNumbers();
        list1.printList();
        System.out.println(" останній доданий елемент - " + list1.lastAddElement());

        //Вивести всі парні значення List
        System.out.print(" парні значення List - ");
        list1.printPairedElements();

        //Вивести всі непарні значення List
        System.out.print(" непарні значення List - ");
        list1.printOddElements();

        //Створити клас черги, додати метод який прийматиме в аргументах число в List і повертатиме останнє яке було додано
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("введіть елемент - ");
        int addelem = Integer.parseInt(reader.readLine());
        list1.addElement(addelem);
        list1.printList();
        System.out.println("останній доданий елемент - " + list1.lastAddElement());


    }
}