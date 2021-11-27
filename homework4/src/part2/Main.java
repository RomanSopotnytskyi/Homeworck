package part2;

public class Main {
    public static void main(String[] args) {

        Person p = new Person();

        p.printPerson();

        System.out.println();

        p.set_id(3);
        p.set_firstName("Roman");
        p.set_lastName("Sopotnytskyi");
        p.set_age(29);
        p.set_address("example@g.com");
        p.printPerson();


    }

}
