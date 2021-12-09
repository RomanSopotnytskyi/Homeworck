package com.lits;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(JavaConfig.class);

        var userService = context.getBean(UserService.class);

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("Taras","Chubay",51));
        userList.add(new User("Irina","Schweidak",32));
        userList.add(new User("OLeh","Sobchuk",45));
        userList.add(new User("Andrii","Horolski",43));
        userList.add(new User("Nikolai","Amosov",89));
        userList.add(new User("Viacheslav","Chornovil ",61));
        userList.add(new User("Sviatoslav","Vakarchuk",46));
        userList.add(new User("Borys","Paton",101));
        userList.add(new User("Igor","Sikorsky",83));
        userList.add(new User("Ruslan","Rotan",40));

        //1) Записати 10 рекордів у базу
        for (User user: userList) {
            userService.addUser(user);
        }

        //4) Метод щоб вивесті всі
        userService.print(userService.getAll());
        System.out.println();

        //2) Додати метод для виделля
        userService.deleteByID(userService.getByID(6));
        userService.print(userService.getAll());
        System.out.println();


        //3) Метод для отримання по Id
        System.out.println(userService.getByID(3).toString());
        System.out.println();
    }
}
