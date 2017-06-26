package com.deok.persistence;

import com.deok.domain.AuthVO;

import java.util.HashMap;
import java.util.List;

public interface AuthDAO {
    public AuthVO getUserById(String id);
    public List<AuthVO> getMembers();
    public HashMap<String,Integer> getInsertDbNum();
    public void insertMember(AuthVO newMember);
    public void insertMember2(AuthVO newMember);
}
