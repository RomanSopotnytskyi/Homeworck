import java.util.LinkedList;
import java.util.Random;

public class Queue {

    private LinkedList<Integer> list;

    public Queue(){
        list = new LinkedList();
    }

    public int addElement(int add){
        list.add(add);
        return add;
    }

    public LinkedList<Integer> getQueue(){
        return list;
    }

    public void initializationListRandomNumbers(int sizeList){
        Random random = new Random();
        for(int i = 0; i < sizeList; i++){
            this.addElement(random.nextInt(100));
        }
    }

    public void printList(){
        for(int elemList : list){
            System.out.print(elemList + " ");
        }
        System.out.println();
    }

    public void printPairedElements(){
        for(int elemList : list) {
            if ((elemList % 2) == 0) {
                System.out.print(elemList + " ");
            }
        }
        System.out.println();
    }

    public void printOddElements(){
        for(int elemList : list) {
            if ((elemList % 2) != 0) {
                System.out.print(elemList + " ");
            }
        }
        System.out.println();
    }
}