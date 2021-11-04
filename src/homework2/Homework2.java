package homework2;

import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {

        // Заповнити масив тільки парними числами
        int [] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i*2;
        }
        System.out.print("масив парних чисел - ");
        for(int i: arr){
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();

        //Заповнити масив рандомними числами
        int [] arr_random = new int[10];
        Random random = new Random();
        System.out.print("масив випадкових чисел - ");
        for(int i = 0; i < arr_random.length; i++){
            arr_random[i] = random.nextInt(100);
        }

        for(int i: arr_random){
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();

        //Вивести середнє значення масиву
        double j=0;
        for(int i: arr_random){
            j += i;
        }
        System.out.println("середнє значення масиву випадкових чисел = " + (j/arr_random.length));

        //Вивести найменше значення в масиві
        int min = arr_random[0];
        for(int i: arr_random){
            if(i < min){
                min = i;
            }
        }
        System.out.println("мінімальне значення - " + min);

        //Вивести найбільше значення масиву
        int max = arr_random[0];
        for(int i: arr_random){
            if(i > max){
                max = i;
            }
        }
        System.out.println("максимальне значення - " + max);

        //Вивести значення парних індексів масиву
        System.out.print("значення парних індексів масиву - ");
        for(int i = 0; i < arr_random.length; i++){
            if((i%2) == 0){
                System.out.print(arr_random[i]);
                System.out.print(' ');
            }
        }
        System.out.println();

        //Вивести перших 20 символів з таблиці ASCI
        for(int i=32; i<53; i++) {
            System.out.print((char) i);
            System.out.print(' ');
        }
    }
}
