/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author MPC
 */
public class Model {    private static String name_db="coperativa";
    private static String user ="root";
    private static String password = "";
    protected String query = "";
    protected ResultSet resultado;
    public void open_get_conexion(){
        try{
            
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Model.name_db,Model.user,Model.password);
            Statement miStatement  = conexion.createStatement();
            this.resultado = miStatement.executeQuery(this.query);//"select * from producto");
            miStatement.close();
            conexion.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    

    
}
