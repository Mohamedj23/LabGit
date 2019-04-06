/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iti.gitproject.controllerinterface;

import com.iti.gitproject.entity.Employee;

/**
 *
 * @author Mohamed Jamal
 */
public interface ControllerInterface {

    public void updateEmployee(Employee employee);

    public void deleteEmployee();

    public void insertEmployee(Employee employee);

    public void getFirstEmployee(Employee employee);

    public void getNextEmployee(Employee employee);

    public void getPreviousEmployee(Employee employee);

    public void getLastEmployee(Employee employee);
}
