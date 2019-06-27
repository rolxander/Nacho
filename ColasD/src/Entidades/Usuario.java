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
    private boolean estado=false;
    public Usuario(){
    };

    public Usuario(String ci, String nombre, String apellido, String codigo, String fecha, String cargo) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.fecha = fecha;
        this.cargo = cargo;
    }
    
    

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
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   public String getNombre(){
       return this.nombre;
   }
   public void setCodigo(String codigo){
       this.codigo = codigo;
   }
   public String getCodigo(){
       return this.codigo;
   }
   public void setApellido(String apellido){
       this.apellido = apellido;
   }
   public String getApellido(){
       return this.apellido;
   }
}
