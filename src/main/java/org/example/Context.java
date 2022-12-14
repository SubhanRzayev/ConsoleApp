package org.example;

import dao.inter.UserDaoInter;
import daoimpl.UserDaoImpl;
import daoimpl.UserDaoImpl2;

public class Context {
    public static UserDaoInter instanceUserDao() {
        return new UserDaoImpl2();
    }
}
