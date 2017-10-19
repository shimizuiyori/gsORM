package com.gushi.gsORM.nativeDB;

public class dbManagerSQLite extends dbManager {

    public dbManagerSQLite () {
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
