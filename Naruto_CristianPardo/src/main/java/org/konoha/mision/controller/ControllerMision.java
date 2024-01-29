
package org.konoha.mision.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.konoha.interfaces.iConsultas;
import org.konoha.ninja.model.NinjaClass;
import org.konoha.persistence.BDConnection;
import org.konoha.persistence.Operations;

public class ControllerMision implements iConsultas {

    @Override
    public List<NinjaClass> ListarNinjas() {
       // Crear Lista
       List<NinjaClass> ninjaList = new ArrayList();
       
       
       Operations.setConnection(BDConnection.MySQLConnection());
       String sentencia = """
                        SELECT n.ID as ID_Ninja,n.Nombre as NombreNinja, n.Rango, n.Aldea, h.Nombre as Habilidad FROM ninja n
                        JOIN habilidad h ON n.Habilidad_ID = h.ID;
                               """;
       
       try (PreparedStatement ps = Operations.getConnection().prepareStatement(sentencia)) {
            
            ResultSet rs = Operations.consultar_BD(ps);

            while (rs.next()) {
                
                NinjaClass ninjaSQL = new NinjaClass();
                
                ninjaSQL.setIdNinja(rs.getInt("ID_Ninja"));
                ninjaSQL.setNombreNinja(rs.getString("NombreNinja"));
                ninjaSQL.setRangoNinja(rs.getString("Rango"));
                ninjaSQL.setAldeaNinja(rs.getString("Aldea"));
                ninjaSQL.setHabilidadNombre(rs.getString("Habilidad"));
                
                ninjaList.add(ninjaSQL);
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
       return ninjaList;
    }

    @Override
    public Object MisionesDisponibles(int id_Ninja) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object AsignarMisionCompletada(int id_Mision) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object AsignarMision(int id_Ninja, int id_MisionAsignar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
