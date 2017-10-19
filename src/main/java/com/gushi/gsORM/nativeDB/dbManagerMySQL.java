package com.gushi.gsORM.nativeDB;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dbManagerMySQL extends dbManager {

    public dbManagerMySQL (String url, String userName, String password) {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://" + url + "?characterEncoding=utf8&useSSL=true&serverTimezone=GMT", userName, password);
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
