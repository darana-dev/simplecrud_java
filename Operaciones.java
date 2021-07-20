/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud_demo.operaciones;

import com.crud_demo.Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author denis.arana
 */
public class Operaciones {

    //metodo de consulta de registros
    public void Consulta() {

        Conexion obj = new Conexion();

        try {
            Connection conn;
            conn = obj.getConnection();
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * from alumno  ");

            System.out.println("----------------------");
            System.out.println("ALUMNOS OBTENIDOS");
            System.out.println("----------------------");
            while (rs.next()) {

                System.out.println("1. Codigo: " + rs.getString(1));
                System.out.println("2. Nombre: " + rs.getString(2));
                System.out.println("3. Telefono: " + rs.getString(3));
                System.out.println("4. Direccion: " + rs.getString(4));
                System.out.println("----------------------");
            }

        } catch (SQLException ex) {
            System.out.println(ex);

        }

    }

    //metodo para insertar registro
    public int agregar(String codigo, String nombre, String tel, String direccion) {

        int flag = 0;
        PreparedStatement ps = null;
        Conexion obj = new Conexion();
        Connection conn = obj.getConnection();

        try {
            String sql = "";
            sql = sql + "insert into alumno"
                    + "(codigo, nombre, telefono, direccion)";
            sql = sql + " values ";
            sql = sql + "(?, ?, ?, ?)";

            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, tel);
            ps.setString(4, direccion);
            flag = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
        }

        return flag;
    }
    
    
    //metodo para actualizar registro
    public int actualizar(String codigo, String tel) {

        int row = 0;
        PreparedStatement ps = null;
        Conexion obj = new Conexion();
        Connection conn = obj.getConnection();

        try {
            String sql = "update alumno set telefono = ? where codigo=?";

            ps = conn.prepareStatement(sql);
            ps.setString(1, tel);
            ps.setString(2, codigo);
            row = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
        }

        return row;
    }
    
    
    //metodo para eliminar registro
    public int eliminar(String codigo) {

        int row = 0;
        PreparedStatement ps = null;
        Conexion obj = new Conexion();
        Connection conn = obj.getConnection();

        try {
            String sql = "delete from alumno where codigo=?";

            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            row = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
        }

        return row;
    }

}
