package practice.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {
		
	    @Id
		private int cust_id;
	    
		private String name;
		
		private int Age;
		
		public int getCust_id() {
			return cust_id;
		}
		public void setCust_id(int cust_id) {
			this.cust_id = cust_id;
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
		
		@Override
		public String toString() {
			return "Customer [cust_id=" + cust_id + ", name=" + name + ", Age=" + Age + "]";
		}
}
