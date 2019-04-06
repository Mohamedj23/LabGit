/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iti.gitproject.model.databasecontrollerinterface;

/**
 *
 * @author Mohamed Jamal
 */
public interface DBConnentivityInterface {

    public void disconnectFromDatabase();

    public void connectToDataBase();
}
