package pack.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pack.User.User;
import pack.conn.Mycon;

public class UserDao {
       
	static Connection con;
	static{		
		try {
			con = Mycon.dbcon();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int addstudent(User u) {
		int status = 0;
		
		try {
			
			String sql = "insert into User(name, Dob, Address, Qualification, Email) values(?, ?, ?, ?, ?)";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, u.getName());
			pstm.setString(2, u.getDob());
			pstm.setString(3, u.getAddress());
			pstm.setString(4, u.getQalification());
			pstm.setString(5, u.getEmail());
			
			status = pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static List<User> getAllrecords(){
		
		List<User> li = new ArrayList<>();
		
		try{
			String sql = "select * from User";
			PreparedStatement pstm = con.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {	
				User u = new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setDob(rs.getString(3));
				u.setAddress(rs.getString(4));
				u.setQalification(rs.getString(5));
				u.setEmail(rs.getString(6));
				li.add(u);	
			}	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return li;
	}
	
	
	public static User getRecordByid(int id) {
		
		User u = null;
		try{
			String sql = "select * from User where id = ?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, id);
			
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {	
				u = new User();
				u.setId(rs.getInt(1));				
				u.setName(rs.getString(2));
				u.setDob(rs.getString(3));
				u.setAddress(rs.getString(4));
				u.setQalification(rs.getString(5));
      			u.setEmail(rs.getString(6));		
			}	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return u;
	}
	
	public static int UpdateUser(User u) {
		
		int status = 0;
		try {
			String sql = "update User set name = ?, Dob = ?, Address = ?, Qualification = ?, Email = ? where Id= ?";
			PreparedStatement pstm = con.prepareStatement(sql);
			
			pstm.setString(1, u.getName());
			pstm.setString(2, u.getDob());
			pstm.setString(3, u.getAddress());
			pstm.setString(4, u.getQalification());
			pstm.setString(5, u.getEmail());
			pstm.setInt(6, u.getId());
			status = pstm.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	public static int DeleteUser(int id) {
		
		int status = 0;
		
		try {
			String sql = "delete from User where id = ? ";
			PreparedStatement pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, id);
			status = pstm.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
}
