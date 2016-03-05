package com.victortoader.angajati.client.controller;

import com.victortoader.angajati.client.model.Employee;
import com.victortoader.angajati.client.view.EmployeeView;
import com.victortoader.angajati.server.EmployeeService;

import java.util.List;

/**
 * Created by 286868 on 3/3/2016.
 * <p/>
 * toate actiunile care se executa din Interfata.
 * <p/>
 * Tot ce este comportament sau actiune se pune in 'Controller'
 */
public class EmployeeController {


    public void addNewEmployee(String nume, String prenume, String adresa, int salariu, byte[] poza) {
    }

    ;

    public void editEmployee(int Id) {
    }

    ;

    public void deleteEmployee(int id) {
    }

    ;

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

    public void exportReport() {

    }

    public void importReport() {
    }

    // write all the methods that


}
