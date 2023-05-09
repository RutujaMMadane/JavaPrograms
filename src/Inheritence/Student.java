package Inheritence;

public class Student extends Person{
	int attendence;
	int totalmark;
	double percentage;
	public Student()
	{
		
	}
	public Student(int id, String pname, String address, String city, String state,int attendence, int totalmark, double percentage)
	{
		super(id, pname, address,city,state);
		this.attendence=attendence;
		this.totalmark=totalmark;
		this.percentage=percentage;
	}
	public int getAttendence() {
		return attendence;
	}
	public void setAttendence(int attendence) {
		this.attendence = attendence;
	}
	public int getTotalmark() {
		return totalmark;
	}
	public void setTotalmark(int totalmark) {
		this.totalmark = totalmark;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [attendence=" + attendence + ", totalmark=" + totalmark + ", percentage=" + percentage + "]";
	}
	
}
