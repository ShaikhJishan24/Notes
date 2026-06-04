package com.SpringJDBC_CRUD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudDao {
      
	private JdbcTemplate jd;

	public JdbcTemplate getJd() {
		return jd;
	}

	public void setJd(JdbcTemplate jd) {
		this.jd = jd;
	}
	
	public int Savestud(Student s) {		
		String sql = "insert into stud values('"+s.getId()+"','"+s.getName()+"','"+s.getRollNo()+"')";
		int i = jd.update(sql);
		return i;
	};
	
	public int update(Student s) {	
		String sql = "update stud set name='"+ s.getName()+"'where id='"+ s.getId()+"' ";
		int i = jd.update(sql);
		return i;
	}
	
	public int delete(Student s) {		
		String sql = "delete from stud where id='"+ s.getId()+"'";
		int i = jd.update(sql);
		return i;
	}
	
	public Student getStudentById(int id) {
			
		String sql = "select * from stud where id='"+ id +"'";
		
		return (Student) jd.query(sql, new RowMapper<Student>(){
	
				@Override
				public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
					Student s = new Student();
					s.setId(rs.getInt(1));  
				    s.setName(rs.getString(2));  
					s.setRollNo(rs.getInt(3));  
					return s;
				};
		 });
	}
	
	public List<Student> getAllStudent() {
			
		String sql = "select * from stud ";
		
		return jd.query(sql, new RowMapper<Student>(){
	
		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student s = new Student();
			s.setId(rs.getInt(1));  
		    s.setName(rs.getString(2));  
			s.setRollNo(rs.getInt(3));  
			return s;
		};
	  });
	}
	
}
