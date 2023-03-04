public class Department {
    String departmentName;
    Staff staff;

    Department(String departmentName, Staff staff) {
        this.departmentName = departmentName;
        this.staff = staff;
    }

    public void display() {
        System.out.println(
                staff.staffName + " is working in the " + departmentName + " department as " + staff.designation);
    }
}