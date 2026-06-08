package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
       
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
       private int id;
       
       private String FName ;
       
       private String LName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", FName=" + FName + ", LName=" + LName + "]";
	}
       
}
