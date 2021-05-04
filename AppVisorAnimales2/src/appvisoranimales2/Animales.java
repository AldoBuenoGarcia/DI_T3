/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales2;

/**
 *
 * @author Aldobg
 */
public class Animales {
    
    private String nombre;
    private String imgMiniatura;
    private String imgGrande;
    
    
    public Animales(){
    
    }
    
    public Animales(String nombre,String imgMin,String imgGrande){
        
        this.nombre = nombre;
        this.imgMiniatura = imgMin;
        this.imgGrande = imgGrande;
    
    
    }

    /*GETTERS AND SETTERS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImgMiniatura() {
        return imgMiniatura;
    }

    public void setImgMiniatura(String imgMiniatura) {
        this.imgMiniatura = imgMiniatura;
    }

    public String getImgGrande() {
        return imgGrande;
    }

    public void setImgGrande(String imgGrande) {
        this.imgGrande = imgGrande;
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
