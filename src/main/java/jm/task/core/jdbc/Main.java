package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();

        userDao.saveUser("Pasha", "Volkov", (byte) 80);
        userDao.saveUser("Gosha", "Peskov", (byte) 14);
        userDao.saveUser("Oleg", "Qwerty", (byte) 2);
        userDao.saveUser("Nikita", "Crud", (byte) 96);

        userDao.getAllUsers().forEach(System.out::println);
        userDao.cleanUsersTable();
        userDao.dropUsersTable();

    }
}
