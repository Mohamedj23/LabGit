/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author Azza
 */
public class NewbuttonHandler implements EventHandler {
    EmployeeGUI employeeGUI;

    public NewbuttonHandler(EmployeeGUI employeeView) {
        this.employeeGUI = employeeView;
    }

    
    @Override
    public void handle(Event event) {
        
        employeeGUI.clearTF();
        employeeGUI.idTF.setEditable(true);
        
        employeeGUI.updateButton.setText("Add");
        
    }
}