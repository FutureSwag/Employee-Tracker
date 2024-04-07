package employee.tracker.com;

import java.util.ArrayList;
import java.util.List;

public class TimesheetManagementSystem {
	private List<Timesheet> timesheets;
    private List<Manager> managers;

    public TimesheetManagementSystem() {
        this.timesheets = new ArrayList<>();
        this.managers = new ArrayList<>();
    }

    public void addTimesheet(Timesheet timesheet) {
        timesheets.add(timesheet);
    }

    public List<Timesheet> viewTimesheets(Employee employee) {
        List<Timesheet> employeeTimesheets = new ArrayList<>();
        for (Timesheet timesheet : timesheets) {
            if (timesheet.getEmployee().getEmpId() == employee.getEmpId()) {
                employeeTimesheets.add(timesheet);
            }
        }
        return employeeTimesheets;
    }

    public List<Timesheet> viewTimesheets(String date) {
        List<Timesheet> dateTimesheets = new ArrayList<>();
        for (Timesheet timesheet : timesheets) {
            if (timesheet.getDate().equals(date)) {
                dateTimesheets.add(timesheet);
            }
        }
        return dateTimesheets;
    }

    public void approveTimesheet(Timesheet timesheet) {
        timesheet.setApproved(true);
    }

    public void rejectTimesheet(Timesheet timesheet) {
        timesheet.setApproved(false);
    }

}
