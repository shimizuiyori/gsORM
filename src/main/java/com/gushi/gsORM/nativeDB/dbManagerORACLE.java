package com.gushi.gsORM.nativeDB;

public class dbManagerORACLE extends dbManager {
    @Override
    public boolean createDB(String dbName) {
        return false;
    }

    @Override
    public boolean deleteDB(String dbName) {
        return false;
    }
}
