/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iti.gitproject.model.databasecontrollerimpl;

import com.iti.gitproject.model.databasecontrollerinterface.DBConnentivityInterface;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author Mohamed Jamal
 */
public class DatabaseConnectivityImpl implements DBConnentivityInterface {

    private Properties properties = new Properties();
    private FileInputStream fileInputStream = null;
    private MysqlDataSource mysqlDataSource = null;
    private Connection connection = null;
    private static Statement statement = null;

    @Override
    public void disconnectFromDatabase() {
        try {
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void connectToDataBase() {
        try {
            fileInputStream = new FileInputStream("src/main/resources/properties/db.properties");
            properties.load(fileInputStream);
            mysqlDataSource = new MysqlDataSource();

            mysqlDataSource.setURL(properties.getProperty("MYSQL_DB_URL"));
            mysqlDataSource.setUser(properties.getProperty("MYSQL_DB_USERNAME"));
            mysqlDataSource.setPassword(properties.getProperty("MYSQL_DB_PASSWORD"));

            connection = mysqlDataSource.getConnection();
            System.out.println("DataBase Connected Succesfully");
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

    static Statement getStatement() {
        return statement;
    }

}
