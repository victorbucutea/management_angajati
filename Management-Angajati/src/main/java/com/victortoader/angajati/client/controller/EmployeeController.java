package com.victortoader.angajati.client.controller;

import com.victortoader.angajati.client.model.Employee;
import com.victortoader.angajati.client.view.EmployeeView;
import com.victortoader.angajati.client.view.UpPanel;
import com.victortoader.angajati.server.EmployeeService;

import java.sql.*;
import java.util.List;

/**
 * Created by 286868 on 3/3/2016.
 * <p/>
 * toate actiunile care se executa din Interfata.
 * <p/>
 * Tot ce este comportament sau actiune se pune in 'Controller'
 */
public class EmployeeController {

   // private EmployeeService service;

    public static Employee addNewEmployee(String name, String firstName, int salary, String adress) {

        Employee employee = new Employee();
        employee.setName(name);
        employee.setFirstName(firstName);
        employee.setSalary(salary);
        employee.setAdress(adress);
        return employee;

    }
//    service.addNewEmployee(employee);
    ;

    public static void updateEmployee(int tfId, String name, String firstName, int salary, String adress, Connection conn) {
        try {
            String sql = "UPDATE Employees SET name=?, firstName=?, salary=?, address=? WHERE id=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, firstName);
            statement.setInt(3, salary);
            statement.setString(4, adress);
            statement.setInt(5, tfId);


            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing employee was modified");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertEmployee(Employee employee, Connection conn) {
        try {
            String sql = "INSERT INTO Employees(name, firstName, salary, email) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getFirstName());
            statement.setInt(3, employee.getSalary());
            statement.setString(4, employee.getAdress());
            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            generatedKeys.next();
            employee.setId((int) generatedKeys.getLong(1));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteEmployee(Long id, Connection conn) {
        try {
            String sql = "DELETE FROM Employees WHERE user_id=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Employee> getAllEmployees() {
        return null;
    }

    ;

    public int getEmployee(int id) {
        return 0;
    }

    ;

    private EmployeeView view;

     // Remote object reference
    // e un obiect proxy. O clasa ce va apela s
    private EmployeeService service;


    public void showPicture() {
        // comanda view-ului sa afiseze poze
    }


    public void refresh() {

    }

//    public XmlReport exportReport() {
//
//    }
//
//    public XmlReport importReport() {
//    }

    // write all the methods that


}
