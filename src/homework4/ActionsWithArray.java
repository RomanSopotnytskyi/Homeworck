package homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ActionsWithArray {
    public int [] arr;

    public ActionsWithArray() {
    }

    public ActionsWithArray(int count_element) {
        this.arr = new int[count_element];
    }

    public ActionsWithArray(int tmp[]) {
        this.arr = tmp;
    }

    public void printArray(){
        for(int i = 0; i < this.arr.length; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }

    public void arrRandom(){
        Random random = new Random();
            for(int i = 0; i < this.arr.length; i++) {
                this.arr[i] = random.nextInt(100);
        }
    }

    public double arithmeticMean() {
        double tmp = 0;
        for (int i : this.arr) {
            tmp += i;
        }
        return tmp/this.arr.length;
    }

    public int minElemArray(){
        int min = this.arr[0];
        for(int i: this.arr){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public int maxElemArray(){
        int max = this.arr[0];
        for(int i: this.arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public void printCoupleIndex(){
        for(int i = 0; i < this.arr.length; i++){
            if((i%2) == 0){
                System.out.print(this.arr[i] + " ");
            }
        }
        System.out.println();
    }

    public void initArrayASCI() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("введіть значення початкового символу таблиці ASCI (>0)- " + " ");
        int start = Integer.parseInt(reader.readLine());
        while (start < 0){
            System.out.println("значення невірне");
            System.out.print("введіть значення початкового символу таблиці ASCI ( > 0 )- " + " ");
            start = Integer.parseInt(reader.readLine());
        }
        System.out.print("введіть значення кінцевого символу таблиці ASCI ( >= початкового) - " + " ");
        int finish = Integer.parseInt(reader.readLine());
        while (finish < start){
            System.out.println("значення невірне");
            System.out.print("введіть значення кінцевого символу таблиці ASCI ( >= початкового) - " + " ");
            finish = Integer.parseInt(reader.readLine());
        }
        arr = new int[2];
        arr[0] = start; arr[1] = finish;
    }

    public void printArreyASCI(){
        int start = arr[0];
        int stop = arr[1];
        for(int i=start; i <= stop; i++) {
            System.out.print((char) i);
            System.out.print(' ');
        }
    }

}
