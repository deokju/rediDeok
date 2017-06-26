package com.deok.dbrouting;

public enum DbType {
   MASTER(1),
   SLAVE(2),
   USERDB(3);

   final private int dbNum;

   DbType(int dbNum) {
      this.dbNum = dbNum;
   }

   public static DbType getDbType(int dbNum){
      for(DbType dbType : DbType.values()) {
         if(dbType.dbNum == dbNum) {
            return dbType;
         }
      }
      return null;
   }
}