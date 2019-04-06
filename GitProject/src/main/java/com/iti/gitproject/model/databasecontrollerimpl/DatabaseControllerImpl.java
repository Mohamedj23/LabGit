/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iti.gitproject.model.databasecontrollerimpl;

import com.iti.gitproject.entity.Employee;
import com.iti.gitproject.model.databasecontrollerinterface.DBControllerInterface;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mohamed Jamal
 */
public class DatabaseControllerImpl implements DBControllerInterface {

    Statement statement = null;
    DatabaseConnectivityImpl database = null;
    ResultSet resultSet = null;
    boolean isEmpty = false;

    public DatabaseControllerImpl() {
        database = new DatabaseConnectivityImpl();
        database.connectToDataBase();
        statement = database.getStatement();
        try {
            resultSet = statement.executeQuery("Select ID, F_NAME,L_NAME,M_NAME,EMAIL,PHONE from Employee");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void disconnectFromDatabase() {
        database.disconnectFromDatabase();
    }

    @Override
    public void getFirstEmployee(Employee employee) {
        try {

            if (!isEmpty) {
                resultSet.first();
                assignValuesToEmployee(employee);
            } else {

                Employee mockEmployee = new Employee();
                assignValuesToEmployee(mockEmployee);
            }
        } catch (SQLException ex) {
            System.out.println("There Are No employees");
        }
    }

    @Override
    public void getNextEmployee(Employee employee) {
        try {

            if (resultSet.next()) {

                assignValuesToEmployee(employee);

            } else {
                getFirstEmployee(employee);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void getPreviousEmployee(Employee employee) {
        try {
            if (resultSet.previous()) {
                assignValuesToEmployee(employee);
            } else {
                resultSet.last();
                assignValuesToEmployee(employee);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void getLastEmployee(Employee employee) {
        try {
            if (resultSet.last()) {

                assignValuesToEmployee(employee);
            } else {
                Employee mockEmployee = new Employee();
                assignValuesToEmployee(mockEmployee);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void insertNewEmployee(Employee employee) {
        boolean isValid = validateEmployee(employee);

        if (isValid) {
            try {
                resultSet.moveToInsertRow();
                resultSet.updateInt(1, employee.getId());
                resultSet.updateString(2, employee.getFirstName());
                resultSet.updateString(3, employee.getMiddleName());
                resultSet.updateString(5, employee.getLastName());
                resultSet.updateString(6, employee.getEmail());
                resultSet.updateString(7, employee.getPhone());
                resultSet.insertRow();
                System.out.println("Saved Succesffuly");
            } catch (SQLException ex) {

                System.out.println("ID is repeated");
            }
        } else {
            System.out.println("Wrong Insertion");
        }
    }

    @Override
    public void updateEmployee(Employee employee) {
        boolean isValid = validateEmployee(employee);
        if (isValid) {
            try {
                resultSet.updateInt(1, employee.getId());
                resultSet.updateString(2, employee.getFirstName());
                resultSet.updateString(3, employee.getMiddleName());
                resultSet.updateString(4, employee.getLastName());
                resultSet.updateString(5, employee.getEmail());
                resultSet.updateString(6, employee.getPhone());
                resultSet.updateRow();
                System.out.println("Updated Successfully");
            } catch (SQLException ex) {
                System.out.println("Wrong Insertion");
            }
        } else {
            System.out.println("Wrong Insertion");
        }
    }

    @Override
    public void deleteEmployee() {
        try {
            if (resultSet.isFirst() && resultSet.isLast()) {
                isEmpty = true;
            }
            resultSet.deleteRow();
            System.out.println("Deleted Successfully");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void assignValuesToEmployee(Employee employee) {
        try {

            employee.setId(resultSet.getInt(1));
            employee.setFirstName(resultSet.getString(2));
            employee.setMiddleName(resultSet.getString(3));
            employee.setLastName(resultSet.getString(4));
            employee.setEmail(resultSet.getString(5));
            employee.setPhone(resultSet.getString(6));

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private boolean validateEmployee(Employee employee) {
        boolean isValid = false;
        if (employee != null) {
            isValid = true;
            if (employee.getId() == 0) {
                isValid = false;
            }
            if (Character.isDigit(employee.getId())) {
                isValid = false;
            }
            if (employee.getFirstName().equals("")) {
                isValid = false;
            }
            if (employee.getMiddleName().equals("")) {
                isValid = false;
            }
            if (employee.getLastName().equals("")) {
                isValid = false;
            }
            if (employee.getEmail().equals("")) {
                isValid = false;
            }
            if (employee.getPhone().equals("")) {
                isValid = false;
            }
        }
        return isValid;

    }
}
