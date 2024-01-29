
package org.konoha.ninja.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.konoha.interfaces.iAprenderJutsu;
import org.konoha.interfaces.iHacerJutsu;
import org.konoha.interfaces.iHacerTaijutsu;
import org.konoha.ninja.model.NinjaClass;
import org.konoha.persistence.BDConnection;
import org.konoha.persistence.Operations;


public class ControllerNinja implements iHacerJutsu<ninja>, iAprenderJutsu<ninja>, iHacerTaijutsu<ninja> {
    
    
    
        @Override
    public ninja RealizarNinjutsu(int id_Habilidad) {
        System.out.println("Nueva Habilidad");
           return null;
    };

    @Override
    public ninja aprenderNuevoNinjutsu() {
        System.out.println("El ninja Aprenderá un nuevo ninjutsu");
           return null;
    };

    @Override
    public ninja TipoDeTaijutsu() {
        System.out.println("El ninja hace Taijutsu");
        return null;
    };
    
    
    // REGISTRAR NINJA
       public static void registrarNinja(NinjaClass ninja) throws SQLException {
           
        Operations.setConnection(BDConnection.MySQLConnection());
        String sentencia = "INSERT INTO Ninja(Nombre, Rango, Aldea, Habilidad_ID)VALUES (?,?,?,?);";
        
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(sentencia)){
            ps.setString(1, ninja.getNombreNinja());
            ps.setString(2,ninja.getRangoNinja());
            ps.setString(3, ninja.getAldeaNinja());
            ps.setInt(4, ninja.getHabilidadNinja());


            int rows = Operations.insert_update_delete_db(ps);
                if (rows <= 0) {
                    System.out.println("Cannot push New Ninja");
                } else {
                    System.out.println("Successful push New Ninja");
                }
         } catch (SQLException e) {
            e.printStackTrace();
            }
        }
        
        
       
    // ELIMINAR NINJA
           public static void eliminarNinja(int id)throws SQLException {
          Operations.setConnection(BDConnection.MySQLConnection());
          String sentencia = "DELETE FROM Ninja WHERE ID = ?;";
          
          try (PreparedStatement ps = Operations.getConnection().prepareStatement(sentencia)){
            ps.setInt(1, id);
            
            int rows = Operations.insert_update_delete_db(ps);
            if (rows > 0) {
                System.out.println("successful delete Ninja");
                return;
            } else {
                System.out.println("not exists Ninja Id");
                return;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("something was wrong on delete this Ninja ID");
        return;
        }
      
       }



