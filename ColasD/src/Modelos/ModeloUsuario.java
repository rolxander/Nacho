/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;
import Entidades.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author MPC
 */
public class ModeloUsuario{
    private static String name_db="coperativa";
    private static String user ="root";
    private static String password = "";
    public Usuario login(String user,String password){
     try{
            String query="SELECT * FROM usuario where ci ='"+user+"' and password = '"+password+"'";
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ModeloUsuario.name_db,ModeloUsuario.user,ModeloUsuario.password);
            Statement miStatement  = conexion.createStatement();
            ResultSet resultado = miStatement.executeQuery(query);//"select * from producto");
            Usuario usuario = new Usuario();
            while(resultado.next()){
                usuario.setEstado();
                usuario.setCargo(resultado.getString("cargo"));
            }
            miStatement.close();
            conexion.close();
            return usuario;
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
        return null;
    }
    
    
}
