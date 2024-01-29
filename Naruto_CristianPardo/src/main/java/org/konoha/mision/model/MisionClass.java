
package org.konoha.mision.model;



public class MisionClass{
    private String nombreMision;
    private String descripcionMision;
    private String recompensaMision;

    public MisionClass() {
    }

    public MisionClass(String nombreMision, String descripcionMision, String recompensaMision) {
        this.nombreMision = nombreMision;
        this.descripcionMision = descripcionMision;
        this.recompensaMision = recompensaMision;
    }

    public String getNombreMision() {
        return nombreMision;
    }

    public void setNombreMision(String nombreMision) {
        this.nombreMision = nombreMision;
    }

    public String getDescripcionMision() {
        return descripcionMision;
    }

    public void setDescripcionMision(String descripcionMision) {
        this.descripcionMision = descripcionMision;
    }

    public String getRecompensaMision() {
        return recompensaMision;
    }

    public void setRecompensaMision(String recompensaMision) {
        this.recompensaMision = recompensaMision;
    }

    @Override
    public String toString() {
        return "MisionClass{" + "nombreMision=" + nombreMision + ", descripcionMision=" + descripcionMision + ", recompensaMision=" + recompensaMision + '}';
    }


}
