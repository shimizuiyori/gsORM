package com.gushi.gsORM.nativeDB;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dbManagerSQLServer extends dbManager {

    public dbManagerSQLServer (String url, String userName, String password) {

        try {
            this.connection = DriverManager.getConnection("jdbc:sqlserver://" + url, userName, password);
            this.connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean createDB(String dbName) {
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement("create database " + dbName);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteDB(String dbName) {
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement("drop database " + dbName);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
