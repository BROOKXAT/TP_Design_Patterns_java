package views;


import beans.Employee;
import services.EmployeeService;

import java.util.List;

public class EmployeeView {
    private EmployeeService employeeService;

    public EmployeeView(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void displayEmployeeList() {
        List<Employee> employees = employeeService.getAllEmployees();
        System.out.println("Liste des employés :");
        for (Employee employee : employees) {
            System.out.println("ID : " + employee.getId() + ", Nom : " + employee.getNom());
        }
    }

}
