package mypack;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		int rollno;
		
		String name;
	
		int Age;
		
		String Address;
		
		public Student(String name, int age, String address) {	
			this.name = name;
			Age = age;
			Address = address;
		}
		
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
		
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		
}
