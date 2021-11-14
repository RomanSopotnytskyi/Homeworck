package homework6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Queue {

    private ArrayList<Integer> arrayList;

    public Queue(){
        arrayList = new ArrayList();
    }

    public void initializationListRandomNumbers() throws IOException {
        int sizeList = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("к-сть елементів ( > 0 )- ");
        sizeList = Integer.parseInt(reader.readLine());
        while (sizeList < 0){
            System.out.println("значення невірне");
            System.out.print("к-сть елементів ( > 0 )- ");
            sizeList = Integer.parseInt(reader.readLine());
        }
        Random random = new Random();
        for(int i = 0; i < sizeList; i++){
            arrayList.add(random.nextInt(100));
        }
    }

    public void printList(){
        for(int elemList : arrayList){
            System.out.print(elemList + " ");
        }
        System.out.println();
    }

    public void printPairedElements(){
        for(int elemList : arrayList) {
            if ((elemList % 2) == 0) {
                System.out.print(elemList + " ");
            }
        }
        System.out.println();
    }

    public void printOddElements(){
        for(int elemList : arrayList) {
            if ((elemList % 2) != 0) {
                System.out.print(elemList + " ");
            }
        }
        System.out.println();
    }

    public void addElement(int add){
        arrayList.add(add);
    }

    public int lastAddElement(){
        return arrayList.get(arrayList.size()-1);
    }
}