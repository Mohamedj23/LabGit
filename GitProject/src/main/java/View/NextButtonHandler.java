/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.iti.gitproject.entity.Employee;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Mohamed Jamal
 */
public class NextButtonHandler implements EventHandler<ActionEvent> {

    EmployeeGUI gui;
    Employee employee = new Employee();

    public NextButtonHandler(EmployeeGUI gui) {
        this.gui = gui;
    }

    @Override
    public void handle(ActionEvent event) {
        gui.getNextEmployee(employee);
        gui.idTF.setText(String.valueOf(employee.getId()));
        gui.firstNameTF.setText(employee.getFirstName());
        gui.middleNameTF.setText(employee.getMiddleName());
        gui.lastNameTF.setText(employee.getLastName());
        gui.emailTF.setText(employee.getEmail());
        gui.phoneTF.setText(employee.getPhone());
    }

}
