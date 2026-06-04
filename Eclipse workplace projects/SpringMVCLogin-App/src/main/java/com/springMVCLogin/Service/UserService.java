package com.springMVCLogin.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springMVCLogin.Dao.UserDao;
import com.springMVCLogin.UserBean.User;

@Service
public class UserService {
    
	@Autowired
	private UserDao UserDao;
	
	public int registeruser(User u) {
		int i = UserDao.SaveUser(u);
		System.out.println("sucessfully Register " + i);
		return i;	
	}
	
	public boolean validateUser(String uname,String passwd) {		
	   return UserDao.ValidUser(uname, passwd);	
	}
}
