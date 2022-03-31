/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgListaPuntos;

/**
 *
 * @author Luis
 */
public class ClsAlumno {
    
    public String nombre;
    public String carnet;
    public double promedio;
    //buscar por carnet y era mejor hacerlo por interfaz
    //es como nodo pero ahora sera ClsAlumno
    //meter 10 alumnos
    public String getnombre(){
        return nombre;
    }
    
    public ClsAlumno(String nombre,String carnet, double promedio){
        this.nombre = nombre;
        this.carnet = carnet;
        this.promedio = promedio;
    }
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getcarnet(){
        return carnet;
    }
    
    public void setcarnet(String carnet){
        this.carnet = carnet;
    }
    
    public double getpromedio(){
        return promedio;
    }
    
    public void setpromedio(double promedio){
        this.promedio = promedio;
    }
    
    public String toString(){
        return "ClsAlumno[ getnombre()="+getnombre()+",getcaret()="+getcarnet()+",getpromedio()="+getpromedio()+"]";
    }
}
