package com.lits.homework11;

import com.lits.homework11.models.User;
import com.lits.homework11.ui.UserConsoleController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class Homework11Application {

	public static void main(String[] args) {
		SpringApplication.run(Homework11Application.class, args);
	}

	@Bean
	public CommandLineRunner run(UserConsoleController userConsoleController){
		return (args) -> {

			ArrayList<User> userList = new ArrayList<>();
			userList.add(new User("Taras","Chubay",51,"Lviv@gmail.com"));
			userList.add(new User("Irina","Schweidak",32,"Zolochiv@outlook.com"));
			userList.add(new User("OLeh","Sobchuk",45,"Ternopil@gmail.com"));
			userList.add(new User("Andrii","Horolski",43,"Cherkasy@outlook.com"));
			userList.add(new User("Nikolai","Amosov",89,"Kyiv@gmail.com"));
			userList.add(new User("Viacheslav","Chornovil ",61,"Lviv@gmail.com"));
			userList.add(new User("Sviatoslav","Vakarchuk",46,"Mukachevo@outlook.com"));
			userList.add(new User("Borys","Paton",101,"Kiiv@outlook.com"));
			userList.add(new User("Igor","Sikorsky",83,"Kiiv@outlook.com"));
			userList.add(new User("Ruslan","Rotan",40,"Poltava@gmail.com"));

			//-Додати 10 різних юзерів
			for (User user: userList) {
				userConsoleController.addUser(user);
			}

			//--Додати ф-нал щоб знайти по ід
			System.out.println("--------------------------------");
			System.out.println(userConsoleController.getUserById(2L));

			//-Додати ф-нал щоб вивести всіх в консоль
			System.out.println("--------------------------------");
			for(User elemList : userConsoleController.getAll()) {
				System.out.println(elemList);
			}

			//-Додати ф-нал щоб знайти по прізвищу
			System.out.println("--------------------------------");
			for(User elemList : userConsoleController.getByLastname("Amosov")) {
				System.out.println(elemList);
			}

			//-Додати ф-нал щоб знайти по  email
			System.out.println("--------------------------------");
			System.out.println(userConsoleController.getByEmail("Cherkasy@outlook.com"));

			//-Додати ф-нал щоб вивести всіх старше 25
			System.out.println("--------------------------------");
			for(User elemList : userConsoleController.getByAge(25)) {
				System.out.println(elemList);
			}

			//-Додати ф-нал щоб вивести всіх email яких закінчується на gmail.com
			System.out.println("--------------------------------");
			for(User elemList : userConsoleController.getWhereEmailIsGmail()) {
				System.out.println(elemList);
			}

			System.out.println("--------------------------------");
		};
	}

}
