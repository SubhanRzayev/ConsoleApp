package org.example;

import com.company.bean.User;
import dao.inter.UserDaoInter;
import daoimpl.UserDaoImpl;

import java.util.List;


public class Main { //Java Database Connectivity = JDBC



    public static void main(String[] args) throws Exception {
    //loosely coupling
    //thightly coupling

        UserDaoInter userDao = Context.instanceUserDao();
//        List<User> list = userDao.getAll();
//        userDao.removeUser(1);
//
//        List<User> list2 = userDao.getAll();
//
//        System.out.printf("list="+list);
//        System.out.printf("list="+list2);

        User u = userDao.getById(2);
        u.setName("Subhan");
        userDao.updateUser(u);

    }
}