package DAO;

import beans.Employee;

import java.util.List;

public class EmployeeDAO {
    private static EmployeeDAO instance;

    private EmployeeDAO() {
        // Constructeur privé
    }

    public static EmployeeDAO getInstance() {
        if (instance == null) {
            instance = new EmployeeDAO();
        }
        return instance;
    }

    public void saveEmployee(Employee employee) {
        // ... votre code de DAO ...
    }

    public List<Employee> getAllEmployees() {
        // ... votre code de DAO ...
        return null;
    }
}
