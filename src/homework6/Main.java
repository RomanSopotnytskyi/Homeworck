package homework6;

public class Main {
    public static void main(String[] args){

        Queue list1 = new Queue();

        //Заповонити List рандомними числами
        list1.initializationListRandomNumbers(10);
        list1.printList();

        //Вивести всі парні значення List
        System.out.print(" парні значення List - ");
        list1.printPairedElements();

        //Вивести всі непарні значення List
        System.out.print(" непарні значення List - ");
        list1.printOddElements();

        //Створити клас черги, додати метод який прийматиме в аргументах число в List і повертатиме останнє яке було додано
        int lastElement = list1.addElement(10);
        list1.printList();
        System.out.println("останній доданий елемент - " + lastElement);



    }
}