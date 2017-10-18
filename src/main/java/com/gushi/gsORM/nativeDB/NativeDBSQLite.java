package com.gushi.gsORM.nativeDB;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class NativeDBSQLite extends absNativeDB {

    public NativeDBSQLite (String dbName) {
        try {
            Connection connection = org.sqlite.JDBC.createConnection(dbName, null);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean createTable(String tableName) {
        return false;
    }

    @Override
    public boolean deleteTable(String tableName) {
        return false;
    }

    @Override
    public String[] getTables() {
        return new String[0];
    }
}
