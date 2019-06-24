/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import Entidades.Usuario;
import java.io.ObjectInputStream;
import Controladores.ControladorUsuario;
/**
 *
 * @author MPC
 */
public class Servidor implements Runnable{
   public Servidor(){
        Thread mi_hilo = new Thread(this);
        mi_hilo.start();
    }
    @Override
    public void run() {
        
       try {
           ServerSocket servidor = new ServerSocket(9999);
           Usuario usuario;
           while(true){
           Socket misocket=servidor.accept();
           ObjectInputStream flujo_entrada = new ObjectInputStream(misocket.getInputStream());
           usuario =(Usuario) flujo_entrada.readObject();
           ControladorUsuario controlador = new ControladorUsuario();
           String nick = usuario.getCi();
           String password = usuario.getPassword();
           usuario=controlador.login(nick, password);
           System.out.print(usuario.getCargo());
           misocket.close();
           
           }    
       } catch (IOException ex) {
           Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
}