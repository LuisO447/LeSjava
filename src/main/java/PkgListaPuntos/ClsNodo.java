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
public class ClsNodo {
    
    private ClsAlumno dato;
    private ClsNodo siguiente;
    private ClsNodo anterior;
    ClsNodo enlace;
    
    public ClsNodo(ClsAlumno dato, ClsNodo siguiente, ClsNodo anterior){//
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.dato = dato;
        enlace = null;
    }

    public ClsNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ClsNodo siguiente) {
        this.siguiente = siguiente;
    }

    public ClsAlumno getDato() {
        return dato;
    }

    public void setDato(ClsAlumno dato) {
        this.dato = dato;
    }
    
    public ClsNodo getAnterior() {
        return anterior;
    }

    public void setAnterior(ClsNodo anterior) {
        this.anterior = anterior;
    }
    
    public String tostring(){
        return "Nodo{"+" dato="+dato+"}";
    }
    
    
}
