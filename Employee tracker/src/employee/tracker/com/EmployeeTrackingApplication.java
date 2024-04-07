package employee.tracker.com;

import java.util.List;

//main class
public class EmployeeTrackingApplication {
	 public static void main(String[] args) {
	        // Sample usage
	        Address address1 = new Address("123 Main St", "Anytown", "State", "12345");
	        Employee employee1 = new Employee("John Doe", "Project A", address1, 101);
	        Manager manager1 = new Manager("Jane Smith", "Project B", address1, 102, "IT", 5);
	        Timesheet timesheet1 = new Timesheet(employee1, "2024-04-07", "Coding", 8);

	        TimesheetManagementSystem system = new TimesheetManagementSystem();
	        system.addTimesheet(timesheet1);

	        List<Timesheet> employee1Timesheets = system.viewTimesheets(employee1);
	        for (Timesheet timesheet : employee1Timesheets) {
	            System.out.println(timesheet.getTask() + " - " + timesheet.getHoursWorked() + " hours");
	        }
	    }
}
