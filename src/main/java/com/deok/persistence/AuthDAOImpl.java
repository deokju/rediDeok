package com.deok.persistence;

import com.deok.domain.AuthVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;

@Repository
public class AuthDAOImpl implements AuthDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace ="AuthMapper";

    public AuthVO getUserById(String id) {
        return session.selectOne(namespace+".getUserById", id);
    }

    public List<AuthVO> getMembers() {
        return session.selectList(namespace+".getMembers");
    }

    public HashMap<String, Integer> getInsertDbNum() {
        return session.selectOne(namespace+".getInsertDbNum");
    }

    public void insertMember(AuthVO newMember) {
        session.insert(namespace+".insertMember", newMember);
    }
    public void insertMember2(AuthVO newMember) {
        session.update(namespace+".insertMember2", newMember);
    }
}


