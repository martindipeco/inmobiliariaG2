/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo2inmobiliaria.accesoDatos;

import grupo2inmobiliaria.entidades.Alquiler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class AlquilerData {
    
    private Connection con;
    
    private InmuebleData inmuData;
    private InquilinoData inquiData;
    
    //constructor
    public AlquilerData()
    {
        con = Conexion.getConexion();
    }
    
    //métodos públicos
    public void generarContrato(Alquiler alqui)
    {
        //debo insertar una fila en la tabla alquiler
        String sql = "INSERT INTO alquiler (idInmueble, idInquilino, idGarante, fechaInicio, fechaFin, monto, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try
        {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, alqui.getInmueble().getId_inmueble());
            ps.setInt(2, alqui.getInquilino().getId_inquilino());
            ps.setInt(3, alqui.getGarante().getId_garante());
            //4: fecha inicio
            //5: fecha fin
            ps.setFloat(6, alqui.getMonto());
            ps.setInt(7, alqui.getEstado());
            
            ps.executeUpdate();
            
            //getGeneratedKeys devuelve un result set
            ResultSet rs = ps.getGeneratedKeys();
            
            //si pudo agregar el contrato, el result set tendra un componenete, al que le seteamos el id
            if(rs.next())
            {
                // 1 es el numero de columna
                alqui.setId_alquiler(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Contrato creado existosamente");
            }
            //cierro el objeto para liberar recursos
            ps.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla alquiler. " + ex.getMessage() );
        }
    }
}
