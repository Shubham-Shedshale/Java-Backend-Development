package jsp.springcore;

import java.util.Map;

public class CompanyMap {
	
	private String name;
	private String location;
	private Map<Integer,String> employees;
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
	public Map<Integer, String> getEmployees() {
		return employees;
	}
	public void setEmployees(Map<Integer, String> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "CompanyMap [name=" + name + ", location=" + location + ", employees=" + employees + "]";
	}
	
	
	

}
