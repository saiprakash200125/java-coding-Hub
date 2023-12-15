public class EmployeeDetails
 {
    public static void main(String args[])
    {
        System.out.println("Employee Details");
        String EmployeeName="Koushik";
        System.out.println(EmployeeName);
        int empid = 520;
        System.out.println(empid);
        String EmployeeRole="Developer";
        System.out.println(EmployeeRole);
        String EmployeeDepartment="Development";
        System.out.println(EmployeeDepartment);
        System.out.println("Total no of working days");
        int totalnoofworkingdays=30;
        System.out.println(totalnoofworkingdays);
        System.out.println("Employee no of working days");
        int noofworkingdays=25;
        System.out.println(noofworkingdays);
        System.out.println("Employee no of absent days");
        int noofdaysabsent=5;
        System.out.println(noofdaysabsent);
        System.out.println("Employee day wise salary");
        int employeedaywisesalary=500;
        System.out.println(employeedaywisesalary);
        System.out.println("Employee Actual salary");
        int employeeactualsalary=(totalnoofworkingdays * employeedaywisesalary);
        System.out.println(employeeactualsalary);
        System.out.println("Employee salary of the month");
        int employeesalaryofthemonth=(noofworkingdays * employeedaywisesalary);
        System.out.println(employeesalaryofthemonth);
        
    }
    
}
