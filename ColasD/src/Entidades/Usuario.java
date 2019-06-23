/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author MPC
 */
public class Usuario {
 private String nombre;
 private String apellido;
 private String codigo;
 private String fecha;
 private String cargo;
 private boolean estado;
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
 
}
