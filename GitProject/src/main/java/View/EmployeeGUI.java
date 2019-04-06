/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.iti.gitproject.MainApp;
import com.iti.gitproject.entity.Employee;
import com.iti.gitproject.view.guiinterface.GuiInterface;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Azza
 */
public class EmployeeGUI extends VBox implements GuiInterface{

    final AnchorPane anchorPane;
    final Label IDLabel;
    final Label firstNameLabel;
    final Label middleNameLabel;
    final Label lastNameLabel;
    final Label emailLabel;
    final Label phoneLabel;
    final TextField idTF;
    final TextField firstNameTF;
    final TextField middleNameTF;
    final TextField lastNameTF;
    final TextField emailTF;
    final TextField phoneTF;
    final Button updateButton;
    final Button deleteButton;
    final Button firstButton;
    final Button newButton;
    final Button previousButton;
    final Button nextButton;
    final Button lastButton;
   // Employee employee;
    MainApp mainObject;

    public EmployeeGUI(MainApp mainObject) {
        this.mainObject = mainObject;
        anchorPane = new AnchorPane();
        IDLabel = new Label();
        firstNameLabel = new Label();
        middleNameLabel = new Label();
        lastNameLabel = new Label();
        emailLabel = new Label();
        phoneLabel = new Label();
        idTF = new TextField();
        firstNameTF = new TextField();
        middleNameTF = new TextField();
        lastNameTF = new TextField();
        emailTF = new TextField();
        phoneTF = new TextField();
        updateButton = new Button();
        deleteButton = new Button();
        firstButton = new Button();
        newButton = new Button();
        previousButton = new Button();
        nextButton = new Button();
        lastButton = new Button();
        //employee = new Employee();
        

        setPrefHeight(400.0);
        setPrefWidth(640.0);

        VBox.setVgrow(anchorPane, javafx.scene.layout.Priority.ALWAYS);
        anchorPane.setMaxHeight(-1.0);
        anchorPane.setMaxWidth(-1.0);
        anchorPane.setPrefHeight(-1.0);
        anchorPane.setPrefWidth(-1.0);

        IDLabel.setLayoutX(27.0);
        IDLabel.setLayoutY(45.0);
        IDLabel.setPrefHeight(17.0);
        IDLabel.setPrefWidth(138.0);
        IDLabel.setText("ID:");

        firstNameLabel.setLayoutX(27.0);
        firstNameLabel.setLayoutY(81.0);
        firstNameLabel.setPrefHeight(17.0);
        firstNameLabel.setPrefWidth(138.0);
        firstNameLabel.setText("First Name");

        middleNameLabel.setLayoutX(27.0);
        middleNameLabel.setLayoutY(114.0);
        middleNameLabel.setPrefHeight(17.0);
        middleNameLabel.setPrefWidth(138.0);
        middleNameLabel.setText("Middle Name");

        lastNameLabel.setLayoutX(27.0);
        lastNameLabel.setLayoutY(144.0);
        lastNameLabel.setPrefHeight(17.0);
        lastNameLabel.setPrefWidth(138.0);
        lastNameLabel.setText("Last Name");

        emailLabel.setLayoutX(27.0);
        emailLabel.setLayoutY(176.0);
        emailLabel.setPrefHeight(17.0);
        emailLabel.setPrefWidth(138.0);
        emailLabel.setText("Email");

        phoneLabel.setLayoutX(27.0);
        phoneLabel.setLayoutY(208.0);
        phoneLabel.setPrefHeight(17.0);
        phoneLabel.setPrefWidth(138.0);
        phoneLabel.setText("Phone");

        idTF.setLayoutX(204.0);
        idTF.setLayoutY(41.0);
        idTF.setPrefHeight(25.0);
        idTF.setPrefWidth(211.0);
        idTF.setPromptText("ID");
        idTF.setEditable(false);

        firstNameTF.setLayoutX(204.0);
        firstNameTF.setLayoutY(77.0);
        firstNameTF.setPrefHeight(25.0);
        firstNameTF.setPrefWidth(211.0);
        firstNameTF.setPromptText("First Name");

        middleNameTF.setLayoutX(204.0);
        middleNameTF.setLayoutY(110.0);
        middleNameTF.setPrefHeight(25.0);
        middleNameTF.setPrefWidth(211.0);
        middleNameTF.setPromptText("Middle Name");

        lastNameTF.setLayoutX(204.0);
        lastNameTF.setLayoutY(140.0);
        lastNameTF.setPrefHeight(25.0);
        lastNameTF.setPrefWidth(211.0);
        lastNameTF.setPromptText("Last Name");

        emailTF.setLayoutX(204.0);
        emailTF.setLayoutY(172.0);
        emailTF.setPrefHeight(25.0);
        emailTF.setPrefWidth(211.0);
        emailTF.setPromptText("Email");

        phoneTF.setLayoutX(204.0);
        phoneTF.setLayoutY(204.0);
        phoneTF.setPrefHeight(25.0);
        phoneTF.setPrefWidth(211.0);
        phoneTF.setPromptText("Phone");

        updateButton.setLayoutX(204.0);
        updateButton.setLayoutY(292.0);
        updateButton.setMnemonicParsing(false);
        updateButton.setText("Update");

        deleteButton.setLayoutX(269.0);
        deleteButton.setLayoutY(292.0);
        deleteButton.setMnemonicParsing(false);
        deleteButton.setPrefHeight(25.0);
        deleteButton.setPrefWidth(61.0);
        deleteButton.setText("Delete");

        firstButton.setLayoutX(340.0);
        firstButton.setLayoutY(292.0);
        firstButton.setMnemonicParsing(false);
        firstButton.setPrefHeight(25.0);
        firstButton.setPrefWidth(55.0);
        firstButton.setText("First");

        newButton.setLayoutX(139.0);
        newButton.setLayoutY(292.0);
        newButton.setMnemonicParsing(false);
        newButton.setPrefHeight(25.0);
        newButton.setPrefWidth(55.0);
        newButton.setText("New");

        previousButton.setLayoutX(408.0);
        previousButton.setLayoutY(292.0);
        previousButton.setMnemonicParsing(false);
        previousButton.setText("Previous");

        nextButton.setLayoutX(484.0);
        nextButton.setLayoutY(292.0);
        nextButton.setMnemonicParsing(false);
        nextButton.setPrefHeight(25.0);
        nextButton.setPrefWidth(55.0);
        nextButton.setText("Next");

        lastButton.setLayoutX(553.0);
        lastButton.setLayoutY(292.0);
        lastButton.setMnemonicParsing(false);
        lastButton.setPrefHeight(25.0);
        lastButton.setPrefWidth(55.0);
        lastButton.setText("Last");

        anchorPane.getChildren().add(IDLabel);
        anchorPane.getChildren().add(firstNameLabel);
        anchorPane.getChildren().add(middleNameLabel);
        anchorPane.getChildren().add(lastNameLabel);
        anchorPane.getChildren().add(emailLabel);
        anchorPane.getChildren().add(phoneLabel);
        anchorPane.getChildren().add(idTF);
        anchorPane.getChildren().add(firstNameTF);
        anchorPane.getChildren().add(middleNameTF);
        anchorPane.getChildren().add(lastNameTF);
        anchorPane.getChildren().add(emailTF);
        anchorPane.getChildren().add(phoneTF);
        anchorPane.getChildren().add(updateButton);
        anchorPane.getChildren().add(deleteButton);
        anchorPane.getChildren().add(firstButton);
        anchorPane.getChildren().add(newButton);
        anchorPane.getChildren().add(previousButton);
        anchorPane.getChildren().add(nextButton);
        anchorPane.getChildren().add(lastButton);
        getChildren().add(anchorPane);
        
        
        
        //**********************************************************
        newButton.setOnAction(new NewbuttonHandler(this));

        updateButton.setOnAction(new UpdateButtonHandler(this));

        deleteButton.setOnAction(new DeleteButtongHandler(this));

        
        firstButton.fire();
        

    }

    void clearTF() {

        idTF.setText(" ");
        firstNameTF.setText(" ");
        middleNameTF.setText(" ");
        lastNameTF.setText(" ");
        emailTF.setText(" ");
        phoneTF.setText(" ");
    }

    /*azza*/
    
    @Override
    public void updateEmployee(Employee employee) {
        mainObject.updateEmployee(employee);
     }

    @Override
    public void insertEmployee(Employee employee) {
        mainObject.insertEmployee(employee);
     }

    @Override
    public void deleteEmployee() {
        mainObject.deleteEmployee();
     }

    @Override
    public void getFirstEmployee(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getNextEmployee(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getPreviousEmployee(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getLastEmployee(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
