package mypack;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dept {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int DeptId;

	String name;

	String loc;

	public Dept() {

	}

	public int getDeptId() {
		return DeptId;
	}

	public void setDeptId(int deptId) {
		DeptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Dept(String name, String loc) {
		this.name = name;
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [DeptId=" + DeptId + ", name=" + name + ", loc=" + loc + "]";
	}

}
