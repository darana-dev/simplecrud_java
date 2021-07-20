/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud_demo.cliente;

import com.crud_demo.operaciones.Operaciones;

/**
 *
 * @author denis.arana
 */
public class Cliente {
    
    public static void main(String args []){
        //instacia de la clase operaciones
        Operaciones o = new Operaciones();
        
            
//CONSULTA DE REGISTROS
    o.Consulta();
    
    
//INSERTA NUEVO ALUMNO
        //int agregado = o.agregar("8", "Lorena Rivas", "445-0933", "San Vicente");
        //if(agregado==1){
        //System.out.print("Registro Agregado");
        //}else{
        //System.out.print("Error registro No agregado");
        //}


//ACTUALIZAR UN REGISTRO
    //int actualizado = o.actualizar("8", "777-7777");
     //if(actualizado==1){
      //System.out.print("Registro actualizado");
     // }else{
     // System.out.print("Error registro No actualizado");
     // }
    
//ELIMINA REGISTRO
   // int eliminado = o.eliminar("8");
    //if(eliminado==1){
      //  System.out.print("Registro eliminado");
        //}else{
        //System.out.print("Error registro No eliminado");
       // }
    
//CONSULTA DE REGISTROS
    o.Consulta();
    
    }
    
}
