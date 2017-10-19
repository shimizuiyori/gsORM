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

        dbManager dbMg = new dbManagerSQLServer("localhost", "sa", "gushihao");
        dbMg.deleteDB("sddd");
    }
}
