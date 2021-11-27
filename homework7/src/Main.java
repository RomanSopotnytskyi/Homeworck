import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        int sizeList = 10;
        List<Integer> list = new ArrayList();
        Random random = new Random();
        for(int i=0; i < sizeList; i++) {
            list.add(random.nextInt(100));
        }

        list.stream().forEach(result -> System.out.print(result + " "));
        System.out.println();

        //За допомогою Stream API вивести парні List і створити новий ліст
        List<Integer> evenValuesArray = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        evenValuesArray.stream().forEach(result -> System.out.print(result + " "));
        System.out.println();

        //За допомогою Stream API вивести не парні List і створити новий ліст
        List<Integer> oddValuesArray = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        oddValuesArray.stream().forEach(result -> System.out.print(result + " "));
        System.out.println();

        //За допомогою Stream API знайти суму усіх чисел в лісті
        list.stream().reduce((sum, x) -> sum + x).stream().forEach(System.out::println);

        //За допомогою Stream API знайти суму усіх парних чисел
        list.stream().filter(i -> i % 2 == 0).reduce((sum, x) -> sum + x).stream().forEach(System.out::println);

        System.out.println("калькулятор натуральних чисел");
        int a = 5;
        int b = 0;
        Сalculator tmp = new Сalculator(a, b);

        try {
            System.out.println(tmp.add());
            System.out.println(tmp.subtract());
            System.out.println(tmp.multiply());
            System.out.println(tmp.devide());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }
}