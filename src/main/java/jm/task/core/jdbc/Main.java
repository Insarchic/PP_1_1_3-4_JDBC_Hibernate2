package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.getConnection();

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Pasha", "Volkov", (byte) 80);
        userService.saveUser("Gosha", "Peskov", (byte) 14);
        userService.saveUser("Oleg", "Qwerty", (byte) 2);
        userService.saveUser("Nikita", "Crud", (byte) 96);

        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();

        Util.closeConnection();


    }
}
