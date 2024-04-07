package employee.tracker.com;

public class Timesheet {
	private Employee employee;
    private String date;
    private String task;
    private int hoursWorked;
    private boolean isApproved;

    public Timesheet(Employee employee, String date, String task, int hoursWorked) {
        this.employee = employee;
        this.date = date;
        this.task = task;
        this.hoursWorked = hoursWorked;
        this.isApproved = false; // Timesheet is initially not approved
    }

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
    
}
