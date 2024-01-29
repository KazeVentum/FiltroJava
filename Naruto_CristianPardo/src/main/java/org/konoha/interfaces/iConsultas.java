
package org.konoha.interfaces;

import java.util.List;

public interface iConsultas<T> {
    List<T> ListarNinjas(); 
    T MisionesDisponibles(int id_Ninja);
    T AsignarMisionCompletada(int id_Mision);
    T AsignarMision(int id_Ninja, int id_MisionAsignar);
}
