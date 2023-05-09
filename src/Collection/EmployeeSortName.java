package Collection;

public class EmployeeSortName implements Comparable<EmployeeSortName>
{

	private int eId;
	private String eName;
	private String address;
	private float salary;
	private static int idgen=1001;
	public EmployeeSortName()
	{
		eId=idgen++;
	}
	public EmployeeSortName(int eId, String eName, String address, float salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.address = address;
		this.salary = salary;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeSort [eId=" + eId + ", eName=" + eName + ", address=" + address + ", salary=" + salary + "]";
	}
	public int compareTo(EmployeeSortName e) {
		// TODO Auto-generated method stub
		//return Float.compare(salary,e.getSalary());
		return eName.compareTo(e.geteName());
	}
	
}



