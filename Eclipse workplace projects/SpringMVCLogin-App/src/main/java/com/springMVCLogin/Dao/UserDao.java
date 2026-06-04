package com.springMVCLogin.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.springMVCLogin.UserBean.User;

@Repository
public class UserDao {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int SaveUser(User u) {
		String sql = "insert into Register values('"+u.getUname()+"','"+u.getEmail()+"','"+u.getPasswd()+"')";
		int i = jdbcTemplate.update(sql);
	    return i;
	}
	
	public boolean ValidUser(String username, String password) {
        String sql = "SELECT COUNT(*) FROM Register WHERE uname = ? AND passwd = ?";
        int count = jdbcTemplate.queryForObject(sql, Integer.class, username, password);
        return count == 1;
    };
		
}
