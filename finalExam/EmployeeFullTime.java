package finalExam;

import java.util.Scanner;

public class EmployeeFullTime extends SalaryPolicy {
    float rate=4;
    EmployeeFullTime employeeFullTime = new EmployeeFullTime();

    EmployeeFullTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Employee Full Time: ");
          baseSalary = sc.nextFloat();

        float Salary = rate * baseSalary;
        System.out.println("Your salary for full time object: "+ Salary);
    }
}
