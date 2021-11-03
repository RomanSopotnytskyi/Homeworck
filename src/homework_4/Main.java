package homework_4;

public class Main {
    public static void main(String[] args) {

        // Заповнити масив тільки парними числами
        int [] tmp = new int[10];
        for(int i = 0; i < tmp.length; i++){
            tmp[i] = i*2;
        }

        Arr x = new Arr(tmp);
        System.out.print("масив парних чисел - ");
        x.print_arr();

        Arr a = new Arr(10);

        //Заповнити масив рандомними числами
        System.out.print("масив випадкових чисел - ");
        a.arr_random();
        a.print_arr();

        //Вивести середнє значення масиву
        System.out.println("середнє значення масиву випадкових чисел = " + a.arithmetic_mean());

        //Вивести найменше значення в масиві
        System.out.println("мінімальне значення - " + a.min_elem_arr());

        //Вивести найбільше значення масиву
        System.out.println("максимальне значення - " + a.max_elem_arr());

        //Вивести значення парних індексів масиву
        System.out.print("значення парних індексів масиву - ");
        a.print_couple_index();

        //Вивести перших 20 символів з таблиці ASCI
        x.asci();
    }
}
