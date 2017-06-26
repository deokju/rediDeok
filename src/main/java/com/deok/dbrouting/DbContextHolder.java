package com.deok.dbrouting;

public class DbContextHolder {

    private static final ThreadLocal<DbType> contextHolder = new ThreadLocal<DbType>();

    public static void setDbType(DbType dbType) {
        if(dbType == null){
            throw new NullPointerException();
        }
        contextHolder.set(dbType);
    }

    public static DbType getDbType() {
        return (DbType) contextHolder.get();
    }

    public static void clearDbType() {
        contextHolder.remove();
    }

    public static void dbchanged(int dbNum) {
        DbContextHolder.setDbType(DbType.getDbType(dbNum));

    }
}