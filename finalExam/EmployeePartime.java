package finalExam;

import java.util.Scanner;

public class EmployeePartime extends SalaryPolicy {
    public float rate = (float)2.5;
    EmployeePartime employeePartime = new EmployeePartime();
     EmployeePartime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("For Employee Part Time" );
          baseSalary = sc.nextFloat();
        float Salary = rate * baseSalary;
        System.out.println("Your salary for part time object: "+ Salary);
    }
}
