/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.iti.gitproject.entity.Employee;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author Azza
 */
public class UpdateButtonHandler implements EventHandler {

    EmployeeGUI gui;
    Employee employee;

    UpdateButtonHandler(EmployeeGUI gui) {
        this.gui = gui;

    }

    @Override
    public void handle(Event event) {
        employee = new Employee();
        
        employee.setFirstName(gui.firstNameTF.getText());
        employee.setMiddleName(gui.middleNameTF.getText());
        employee.setLastName(gui.lastNameTF.getText());
        employee.setEmail(gui.emailTF.getText());
        employee.setPhone(gui.phoneTF.getText());

        if (gui.idTF.isEditable()) {
            int id = Integer.parseInt(gui.idTF.getText());
            employee.setId(id);
            gui.insertEmployee(employee);
            gui.idTF.setEditable(false);
            gui.updateButton.setText("Update");
        } else {
            int id = Integer.parseInt(gui.idTF.getText());
            employee.setId(id);
            gui.updateEmployee(employee);
        }

    }
}
