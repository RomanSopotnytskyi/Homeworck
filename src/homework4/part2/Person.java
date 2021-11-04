package homework4.part2;

public class Person {

    public  int id;
    public String firstName;
    public String lastName;
    public int age;
    public String address;

    public Person() {
        this.id = 0;
        this.firstName = "Jonh";
        this.lastName = "Doe";
        this.age = 0;
        this.address = null;
    }

    public Person(int tmp_id, String tmp_fN, String tmp_lN, int tmp_age, String tmp_adress){
        this.id = tmp_id;
        this.firstName = tmp_fN;
        this.lastName = tmp_lN;
        this.age = tmp_age;
        this.address = tmp_adress;
    }

    public Person(Person tmp) {
        this.id = tmp.id;
        this.firstName = tmp.firstName;
        this.lastName = tmp.lastName;
        this.age = age;
        this.address = tmp.address;
    }

    public void set_id(int tmp_id){
        if(tmp_id > 0) {
            id = tmp_id;
        }else{
            System.out.println("id is incorrectly");
        }
    }

    public void set_firstName(String tmp_fN){
        this.firstName = tmp_fN;
    }

    public void set_lastName(String tmp_lN){
        lastName = tmp_lN;
    }

    public void set_age(int tmp_age){
        if(tmp_age > 0) {
            age = tmp_age;
        }else{
            System.out.println("age is incorrectly");
        }
    }

    public void set_address(String tmp_address){
        address = tmp_address;
    }

    public void printPerson(){
        System.out.println(" id = " + id);
        System.out.println(" firstName = " + firstName);
        System.out.println(" lastName = " + lastName);
        System.out.println(" age = " + age );
        System.out.println(" addres = " + address);
    }

}
