
package org.konoha.ninja.model;

public class NinjaClass {
    private int idNinja;
    private String nombreNinja;
    private String rangoNinja;
    private String aldeaNinja;
    private int habilidadNinja;
    private String HabilidadNombre;

    
    public NinjaClass() {
    }

    public NinjaClass( String nombreNinja, String rangoNinja, String aldeaNinja, int habilidadNinja) {
        this.nombreNinja = nombreNinja;
        this.rangoNinja = rangoNinja;
        this.aldeaNinja = aldeaNinja;
        this.habilidadNinja = habilidadNinja;
    }


    
    public int getIdNinja() {
        return idNinja;
    }

    public void setIdNinja(int idNinja) {
        this.idNinja = idNinja;
    }
    
    public String getNombreNinja() {
        return nombreNinja;
    }

    public void setNombreNinja(String nombreNinja) {
        this.nombreNinja = nombreNinja;
    }

    public String getRangoNinja() {
        return rangoNinja;
    }

    public void setRangoNinja(String rangoNinja) {
        this.rangoNinja = rangoNinja;
    }

    public String getAldeaNinja() {
        return aldeaNinja;
    }

    public void setAldeaNinja(String aldeaNinja) {
        this.aldeaNinja = aldeaNinja;
    }

    public int getHabilidadNinja() {
        return habilidadNinja;
    }

    public void setHabilidadNinja(int habilidadNinja) {
        this.habilidadNinja = habilidadNinja;
    }
    
    public String getHabilidadNombre() {
        return HabilidadNombre;
    }

    public void setHabilidadNombre(String HabilidadNombre) {
        this.HabilidadNombre = HabilidadNombre;
    }

    @Override
    public String toString() {
        return "NinjaClass{" + "idNinja=" + idNinja + ", nombreNinja=" + nombreNinja + ", rangoNinja=" + rangoNinja + ", aldeaNinja=" + aldeaNinja + ", HabilidadNombre=" + HabilidadNombre + '}';
    }








    
    
}
