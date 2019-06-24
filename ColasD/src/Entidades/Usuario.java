/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;

/**
 *
 * @author MPC
 */
public class Usuario implements Serializable {
 private String ci;
 private String nombre;
 private String apellido;
 private String codigo;
 private String fecha;
 private String cargo;
 private String password;
 private boolean estado;
 public Usuario(){
 
 };
 public Usuario(String ci, String password){
     this.setPassword(password);
     this.setCi(ci);
 }
 public void setEstado(){
     this.estado = true;
 }
 
public boolean getEstado(){
    return this.estado;
 }

public String getCargo(){
    return this.cargo;
}
public void setCargo(String cargo){
    this.cargo = cargo;
}
public void setPassword(String password){
    this.password = password;
}
public void setCi(String ci){
    this.ci = ci;
    }
public String getCi(){
    return this.ci;
}
public String getPassword(){
return this.password;
}
}
