package employee.tracker.com;

public class Manager extends Employee{
	private String departmentName;
    private int numReporting;

    public Manager(String name, String projectName, Address address, int empId, String departmentName, int numReporting) {
        super(name, projectName, address, empId);
        this.departmentName = departmentName;
        this.numReporting = numReporting;
    }
}
