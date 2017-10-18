package com.gushi.gsORM.test;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.sqlite.JDBC;

import com.gushi.gsORM.nativeDB.*;

public class App {

    public App () {

        System.out.println("你好，世界！");

        absNativeDB db = new NativeDBSQLite("jdbc:sqlite:tt.db");

//        try {
//            Connection connection = DriverManager.getConnection("jdbc:sqlite:kk.db");
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
