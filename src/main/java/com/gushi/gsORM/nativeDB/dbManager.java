
package com.gushi.gsORM.nativeDB;

import java.sql.Connection;

public abstract class dbManager {

    protected Connection connection;

    public abstract boolean createDB (String dbName);
    public abstract boolean deleteDB (String dbName);
}
