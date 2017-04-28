package com.emergentes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {
    // Variable para almacenar el driver
    // private static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    // Variable para especificar la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/bd_biblio";
    // Usuario de la BD
    private static final String USUARIO = "root";
    // Password de la base de datos
    private static final String CLAVE = "";
    
    public int modificarRegistro(String consultaSQL){
        
        Connection conn;
        Statement sentencia;
        int filasAfectadas = 0;
        
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
            sentencia = conn.createStatement();
            filasAfectadas = sentencia.executeUpdate(consultaSQL);    
        } catch (ClassNotFoundException e){
            System.out.println("Error driver " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL " + e.getMessage());
        } 
        return filasAfectadas;
    }
    
    public ResultSet seleccionarRegistros(String consultaSQL){
        Connection conn;
        Statement sentencia;
        ResultSet filas = null;
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
            sentencia = conn.createStatement();
            filas = sentencia.executeQuery(consultaSQL);
            
        } catch (ClassNotFoundException e){
            System.out.println("Error Driver " + e.getMessage());
        } catch (SQLException e){
            System.out.println("Error de SQL " + e.getMessage());
        }     
        return filas;      
    }   
}
