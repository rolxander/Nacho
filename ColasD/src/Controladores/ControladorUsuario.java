/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import Modelos.ModeloUsuario;
import Entidades.Usuario;
/**
 *
 * @author MPC
 */
public class ControladorUsuario {
    public Usuario login(String user,String password){
        ModeloUsuario login = new ModeloUsuario();
        Usuario usuario = login.login(user, password);
        return usuario;
    }
}
