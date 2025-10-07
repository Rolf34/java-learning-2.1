public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Department department;
    private Position position;
    private String hireDate;
    private double salary;
    private WorkSchedule workSchedule;
    private boolean isActive;

    public Employee(String employeeId, String firstName, String lastName, String email, String phoneNumber,
                    Department department, Position position, String hireDate, double salary,
                    WorkSchedule workSchedule, boolean isActive) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.position = position;
        this.hireDate = hireDate;
        this.salary = salary;
        this.workSchedule = workSchedule;
        this.isActive = isActive;
    }

    public void startWorkDay() {}
    public void endWorkDay() {}
    public void requestVacation() {}
    public void requestSickLeave() {}

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", hireDate='" + hireDate + '\'' +
                ", salary=" + salary +
                ", workSchedule=" + workSchedule +
                ", isActive=" + isActive +
                '}';
    }
}
