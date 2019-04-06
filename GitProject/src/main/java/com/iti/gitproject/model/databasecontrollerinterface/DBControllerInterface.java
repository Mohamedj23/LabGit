/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iti.gitproject.model.databasecontrollerinterface;

import com.iti.gitproject.entity.Employee;

/**
 *
 * @author Mohamed Jamal
 */
public interface DBControllerInterface {

    public void disconnectFromDatabase();

    public void getFirstEmployee(Employee employee);

    public void getNextEmployee(Employee employee);

    public void getPreviousEmployee(Employee employee);

    public void getLastEmployee(Employee employee);

    public void insertNewEmployee(Employee employee);

    public void updateEmployee(Employee employee);

    public void deleteEmployee();
}
