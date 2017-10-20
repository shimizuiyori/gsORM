package com.gushi.gsORM.ORM;

public interface IDataBase {

    public <T> T Save (T pObj);
    public <T> boolean Delete (T pObj);
    public <T> T Update (T pObj);

    public void Tables (String tableName);
}
