package variablesAndDataTypes;

public enum DaysDemo {
	
	MONDAY(0),
	TUESDAY(1),
	WEDNESDAY(2),
	THRUSDAY(4),
	FRIDAY(5),
	SATURDAY(6);
	
	int daysdemoindex;
	DaysDemo(int daysdemoindex)
	{
		this.daysdemoindex=daysdemoindex;
	}
	public int getDaysdemoindex() {
		return daysdemoindex;
	}
	public void setDaysdemoindex(int daysdemoindex) {
		this.daysdemoindex = daysdemoindex;
	}
	

}
