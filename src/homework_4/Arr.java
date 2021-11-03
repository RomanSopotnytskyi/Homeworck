package homework_4;

import java.util.Random;

public class Arr {
    public int [] arr;

    public Arr() {
    }

    public Arr(int count_element) {
        this.arr = new int[count_element];
    }

    public Arr(int tmp[]) {
        this.arr = tmp;
    }

    public void print_arr(){
        for(int i = 0; i < this.arr.length; i++) {
            System.out.print(this.arr[i]);
            System.out.print(' ');
        }
        System.out.println();
    }

    public void arr_random(){
        Random random = new Random();
            for(int i = 0; i < this.arr.length; i++) {
                this.arr[i] = random.nextInt(100);
        }
    }

    public double arithmetic_mean() {
        double j = 0;
        for (int i : this.arr) {
            j += i;
        }
        return j/this.arr.length;
    }

    public int min_elem_arr(){
        int min = this.arr[0];
        for(int i: this.arr){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public int max_elem_arr(){
        int max = this.arr[0];
        for(int i: this.arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public void print_couple_index(){
        for(int i = 0; i < this.arr.length; i++){
            if((i%2) == 0){
                System.out.print(this.arr[i]);
                System.out.print(' ');
            }
        }
        System.out.println();
    }

    public void asci(){
        for(int i=32; i<53; i++) {
            System.out.print((char) i);
            System.out.print(' ');
        }
    }

}
