package com.iti.gitproject;

import View.EmployeeGUI;
import com.iti.gitproject.controllerinterface.ControllerInterface;

import com.iti.gitproject.entity.Employee;
import com.iti.gitproject.model.databasecontrollerimpl.DatabaseControllerImpl;
import com.iti.gitproject.model.databasecontrollerinterface.DBControllerInterface;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application implements ControllerInterface {

    DBControllerInterface dbController;

    public MainApp() {
       dbController=new DatabaseControllerImpl();
    }

    @Override
    public void start(Stage stage) throws Exception {
        EmployeeGUI root = new EmployeeGUI(this);

        Scene scene = new Scene(root);

        stage.setTitle("Employees Sheet");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /*azza*/
    
    
    @Override
    public void updateEmployee(Employee employee) {
        dbController.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee() {
        dbController.deleteEmployee();
    }

    @Override
    public void insertEmployee(Employee employee) {
        dbController.insertNewEmployee(employee);
    }

    /*mohamed*/
    
    @Override
    public void getFirstEmployee(Employee employee) {
        dbController.getFirstEmployee(employee);
    }

    @Override
    public void getNextEmployee(Employee employee) {
        dbController.getNextEmployee(employee);
    }

    @Override
    public void getPreviousEmployee(Employee employee) {
        dbController.getPreviousEmployee(employee);
    }

    @Override
    public void getLastEmployee(Employee employee) {
        dbController.getLastEmployee(employee);
    }

}