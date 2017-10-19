package com.gushi.gsORM.nativeDB;

import java.sql.DriverManager;
import java.sql.SQLException;

public class dbManagerSQLite extends dbManager {

    public dbManagerSQLite () {
        try {
            this.connection = DriverManager.getConnection("jdbc:sqlite:test.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean createDB(String dbName) {
        return false;
    }

    @Override
    public boolean deleteDB(String dbName) {
        return false;
    }
}
