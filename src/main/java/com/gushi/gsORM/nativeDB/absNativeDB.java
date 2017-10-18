package com.gushi.gsORM.nativeDB;

public abstract class absNativeDB {

    public absNativeDB() {

    }

    public abstract boolean createTable (String tableName);
    public abstract boolean deleteTable (String tableName);
    public abstract String[] getTables ();
}
