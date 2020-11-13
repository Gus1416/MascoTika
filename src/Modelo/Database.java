/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;


import java.sql.*;
import java.util.*;

public class Database {
    
private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
private final String URL= "jdbc:sqlserver://localhost:1433;databaseName=sistema_mascotika";
private final String USER= "sebastian";
private final String PASSWORD= "12345";
private Connection conexion;


public Database(){
    try{
        Class.forName(DRIVER);
        conexion=DriverManager.getConnection(URL, USER, PASSWORD);
   
}catch(ClassNotFoundException e){
    e.printStackTrace();
}
catch(SQLException e){
        e.printStackTrace();
    }
    
   
}

// ESTE METODO SIRVE PARA EJECUTAR CONSULTAS QUE NO REGRESAN DATOS, RECIBE COMO PARAMETRO LA CONSULTA QUE QUIERO EJECUTAR 
public int actualizar(String consulta){
try{
    Statement st= conexion.createStatement();
    return st.executeUpdate(consulta);
}catch(SQLException e){
    e.printStackTrace();
}
return 0;      // SI LA EJECUCION PROVOCA ERROR TIRA FALLOS Y RETORNA UN 0
}


// METODO PARA EJECUTAR CONSULTAS QUE INVOLUCREN TABLAS que  SI DEVUELVEN DATOS, RETORNA UN ARREGLO DINAMICO DE LOS DATOS DE LA BD
public List ejecutar(String consulta){
    ResultSet rs= null;
    List resultado= new ArrayList();  
    //Array list iniciado vacio, por lo que si la consulta no tiene registro se retorna vacio
    
    try{
    Statement st= conexion.createStatement();
    rs=st.executeQuery(consulta);
    resultado= acomodarDatos(rs);   
}catch(SQLException e){
    e.printStackTrace();
}
 return resultado;

}

// Metodo que revisa cuantas columnas vienen en el resultado
private List acomodarDatos(ResultSet rs){
    List renglones= new ArrayList();
    try{
     int cantColumnas= rs.getMetaData().getColumnCount();   ///Cantidad de columnas que contiene 
    while(rs.next()){
       
        Map<String,Object> renglon = new HashMap();                           //STRING ES EL NOMBRE DEL CAMPO. OBJECT ES EL VALOR DE ESE CAMPO
        for(int i= 1; i <=cantColumnas; i++){
            String nombreCampo=rs.getMetaData().getColumnName(i);    //// Obtiene el nombre de la columna
            Object valor= rs.getObject(nombreCampo);
            renglon.put(nombreCampo, valor);
        }
        renglones.add(renglon);
    }
    }catch(SQLException e){
        e.printStackTrace();
    }
    return renglones;                       //si hay resultados en la consulta retorna los resultados de la misma en un map
}


public boolean ejecutarProcedimiento(String nombre){
    try{
        CallableStatement cs= conexion.prepareCall("  {call   "  + nombre+  "  }  " );
       return  cs.execute();
    }catch(SQLException e){
        e.printStackTrace();
    }
    
    return false;
}



///////////////// Import java.sql.*;        para agregar variables de tipo fecha con ----> private Date Fecha;


///////////////////////////Estos son los 3 metodos principales para invocar las consultas desde la aplicacion 


public void cerrarConexion(){                    // evidentemente este metodo lo que hace es cerra la conexion con la base de datos 
    try{
    conexion.close();
}catch(SQLException e){
    e.printStackTrace();
}
}



} //// FINAL CLASE DATABASE /////////////////////