package com.gushi.gsORM.test;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.gushi.gsORM.nativeDB.*;
import com.mysql.jdbc.Driver;
import org.sqlite.JDBC;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class App {

    public App () {

        dbManager dbMg = new dbManagerSQLite();

//        while (true) {
//            dbMg.createDB("nihao");
//            System.out.println("创建好了");
//            dbMg.deleteDB("nihao");
//            System.out.println("删除好了");
//        }

    }
}
