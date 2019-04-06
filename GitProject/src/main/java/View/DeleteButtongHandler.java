/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Azza
 */
public class DeleteButtongHandler implements EventHandler<ActionEvent> {

    EmployeeGUI gui;

    public DeleteButtongHandler(EmployeeGUI gui) {
        this.gui = gui;
    }

    @Override
    public void handle(ActionEvent event) {

        gui.deleteEmployee();
        //gui.firstButton.fire();

    }

}