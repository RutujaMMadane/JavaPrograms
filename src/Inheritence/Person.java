package Inheritence;

public class Person {
	int id;
	String pname;
	String address;
	String city;
	String state;
	public Person()
	{
		
	}
	public Person(int id, String pname, String address, String city, String state)
	{
		super();
		this.id=id;
		this.pname=pname;
		this.address=address;
		this.city=city;
		this.state=state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", pname=" + pname + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
