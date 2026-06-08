package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import entities.User;

@Repository
public class UserDao {
		
		@Autowired
		private JdbcTemplate jd;
		
		// insert Operation
		public boolean insert(User u){
			boolean status = false;
			try {
				String sql = "insert into User(id, fname, lname, Age) values (?,?,?,?)";
				int count = jd.update(sql, u.getId(), u.getFname(), u.getLname(), u.getAge());
				if(count > 0) {
					status = true;
				}
				else {
					status = false;
				}
			}
			catch(Exception e){
				status = false;
				e.getMessage();
			}
			return status;
		}
		
		// update User details
		public boolean Updateuser(User u){
			boolean status = false;
			try {
				String sql = "Update User set Age = ? where id = ?";
				int count = jd.update(sql, u.getAge(), u.getId());
				if(count > 0) {
					status = true;
				}
				else {
					status = false;
				}
			}
			catch(Exception e){
				e.getMessage();
			}
			return status;
		}
		
		// deleteUserByid
		public boolean DeleteuserById(int id){
			boolean status = false;
			try {
				String sql = "delete from User where id = ?";
				int count = jd.update(sql, id);
				if(count > 0) {
					status = true;
				}
				else {
					status = false;
				}
			}
			catch(Exception e){
				e.getMessage();
			}
			return status;
		}
		
		// getUSerById
		public User getUserById(int id) {
			
			String sql = "select * from User where id=?";
			
			return (User) jd.queryForObject(sql, new RowMapper<User>(){
		
					public User mapRow(ResultSet rs, int rowNum) throws SQLException {
						User u = new User();
						u.setId(rs.getInt("id"));        // or rs.getInt(1) same for below method 
					    u.setFname(rs.getString("fname"));
					    u.setLname(rs.getString("lname"));
						u.setAge(rs.getInt("Age"));  
						return u;
					};
			 }, id);
		}
		
		// getAllUser
		public List<User> getAllUser(){
			String sql = "select * from user ";
			
			return jd.query(sql, new RowMapper<User>(){
		
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u = new User();
				u.setId(rs.getInt(1));  
			    u.setFname(rs.getString(2));
			    u.setLname(rs.getString(3));
			    u.setAge(rs.getInt(4));
				return u;
			};
		  });
		}
}
