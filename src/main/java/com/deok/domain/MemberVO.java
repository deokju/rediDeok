package com.deok.domain;

public class MemberVO {

    String      id;
    String      name;
    int         age;
    int         dbNum;


    public MemberVO() {
        super();
    }

    public MemberVO(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDbNum() {
        return dbNum;
    }

    public MemberVO setDbNum(int dbNum) {
        this.dbNum = dbNum;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MemberVO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", dbNum=").append(dbNum);
        sb.append('}');
        return sb.toString();
    }
}
