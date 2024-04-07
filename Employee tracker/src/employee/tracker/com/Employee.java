package employee.tracker.com;

public class Employee {
	private String name;
    private String projectName;
    private Address address;
    private int empId;

    public Employee(String name, String projectName, Address address, int empId) {
        this.name = name;
        this.projectName = projectName;
        this.address = address;
        this.empId = empId;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
}
