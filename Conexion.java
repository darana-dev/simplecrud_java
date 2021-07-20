/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud_demo.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author denis.arana
 */
public class Conexion {
    
     Connection cn;
     String url="jdbc:derby://localhost:1527/colegio";
     String usuario="colegio";
     String password="123";
    
    public Connection getConnection(){
        try{
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            DriverManager.deregisterDriver(new org.apache.derby.jdbc.ClientDriver());
            cn=DriverManager.getConnection(url,usuario,password);
            
        }
        
        catch(SQLException e){
        }
        
        return cn;
    }
    
}
