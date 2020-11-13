/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
    public  static Connection conectar (){
        Connection con = null;
        
         String password = "2019024516";
         String usuario = "SebCor";
        String url = "jdbc:sqlserver://DESKTOP-PHP5KCJ\\SEBCORDB:1433;databaseName=test;user=" + usuario
                        + ";password=" + password;
        try {
                con = DriverManager.getConnection(url);
                if (con != null){
                    System.out.println("Conectado"); 
                }
        }catch (SQLException e){
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return con;
    }
    
    public static void main(String[] args){
        conectar();
    }

}
