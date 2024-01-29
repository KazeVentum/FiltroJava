package org.konoha;



import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import org.konoha.mision.controller.ControllerMision;
import org.konoha.ninja.controller.ControllerNinja;
import org.konoha.ninja.model.NinjaClass;

public class Main {
    public static void main(String[] args) throws SQLException {
      
        Scanner input = new Scanner(System.in);
System.out.println("Bienvenido a Konoha Mission System \n --- MENU --- \n 1. Insertar un nuevo Ninja\n 2. Mostrar Ninjas \n 3. Eliminar Ninja ");
int num = input.nextInt();

    switch (num) {
        case 1 -> {
            // REGISTRAR NINJA

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa Los datos de un ninja Por favor");

            System.out.println("Nombre:");
            String nombreNinja = scanner.nextLine();

            System.out.println("Rango:");
            String rangoNinja = scanner.nextLine();

            System.out.println("Aldea:");
            String aldeaNinja = scanner.nextLine();

            System.out.println("Habilidad ID:");
            int habilidadId = scanner.nextInt();

            NinjaClass newNinja = new NinjaClass(nombreNinja, rangoNinja, aldeaNinja, habilidadId );

            ControllerNinja ingresarNinja = new ControllerNinja();

            ingresarNinja.registrarNinja(newNinja);
        }
        
        
        case 2 -> {
            // Mostrar Ninjas

            ControllerMision mostrarNinjas = new ControllerMision();
            List<NinjaClass> listNinjas = mostrarNinjas.ListarNinjas();

            for (NinjaClass ninja1 : listNinjas){
                System.out.println(ninja1.toString());
            } 
            }
        }
    
  }     
}   


 
