package jsp.springcore;

import java.util.List;

public class College {
	
	private String name;
	private String location;
	private List<String> dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<String> getDept() {
		return dept;
	}
	public void setDept(List<String> dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", location=" + location + ", dept=" + dept + "]";
	}
     
	
}
