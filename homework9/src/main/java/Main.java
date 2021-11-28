import java.sql.*;

import java.sql.Connection;
import java.util.ArrayList;

public class Main {

    private static Connection connection = null;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
    private static final String URL = "jdbc:mysql://localhost:3306/dz9?useUnicode=true&serverTimezone=UTC";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");

        connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Taras","Chubay",51,"Lviv"));
        personList.add(new Person("Irina","Schweidak",32,"Zolochiv"));
        personList.add(new Person("OLeh","Sobchuk",45,"Ternopil"));
        personList.add(new Person("Andrii","Horolski",43,"Cherkasy"));
        personList.add(new Person("Nikolai","Amosov",89,"Kyiv"));
        personList.add(new Person("Viacheslav","Chornovil ",61,"Lviv"));
        personList.add(new Person("Sviatoslav","Vakarchuk",46,"Mukachevo"));
        personList.add(new Person("Borys","Paton",101,"Kiiv"));
        personList.add(new Person("Igor","Sikorsky",83,"Kiiv"));
        personList.add(new Person("Ruslan","Rotan",40,"Poltava"));

        //За допомогою джави створити в таблиці 10 різних юзерів
        for (Person person: personList) {
            PreparedStatement insertStatement = connection.prepareStatement("Insert into user(firstName, lastName, age, city) value(?, ?, ?, ?);");
            insertStatement.setString(1, person.getFirstName());
            insertStatement.setString(2, person.getLastName());
            insertStatement.setInt(3, person.getAge());
            insertStatement.setString(4, person.getCity());
            insertStatement.executeUpdate();
        }

        //витягнути з бази тих хто старше 18;
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM user WHERE age > ?");
        statement.setInt(1, 18);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id")
                    +" "+ resultSet.getString("firstName")
                    +" "+ resultSet.getString("lastName")
                    +" "+ resultSet.getInt("age")
                    +" "+ resultSet.getString("city")
            );
        }
        System.out.println();

        //Тих в кого в адресі є місто львів
        statement = connection.prepareStatement("SELECT * FROM user WHERE city LIKE ?");
        statement.setString(1, "Lviv");
        resultSet = statement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id")
                    +" "+ resultSet.getString("firstName")
                    +" "+ resultSet.getString("lastName")
                    +" "+ resultSet.getInt("age")
                    +" "+ resultSet.getString("city")
            );
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
