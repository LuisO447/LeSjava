/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgListaPuntos;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class ClsLista {
    
      // Cabeza , head
    public Nodo primero;

    public ClsLista() {
        primero = null;
    }

    // Funcion para obtener numeros
    private int leerEntero() {
        System.out.println("Ingrese valor, -1 para terminar");

        return Integer.parseInt(new Scanner(System.in).nextLine());

    }

    public ClsLista crearLista() {
        int x;
        primero = null;

        do {
            x = leerEntero();
            if (x != -1) {
                primero = new Nodo(x, primero);
            }
        } while (x != -1);

        return this;
    }
    
    public ClsLista insertarCabezaLista(int entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }
    
    public void visualizar(){
        
        Nodo n;
        int k = 0;
        n = primero;
        
        while (n != null){
            System.out.println(n.dato+" ");
            n = n.enlace;
            k++;
            System.out.print((k%15 != 0 ? " ": "/n"));
        }
        
    }
    
    public ClsLista insertarUltimo(Nodo ultimo, int entrada){
        ultimo.enlace = new Nodo(entrada);
        ultimo = ultimo.enlace;
        return this;
    }
    
    public Nodo buscarLista(int valorBuscar){
        Nodo indice;
        for(indice = primero; indice != null; indice = indice.enlace){
            if(valorBuscar == indice.dato){//valorbuscar.equals(indice.dato)
                return indice;
            }
        }
        return null;
    }
    
    //insertar la lista
    public ClsLista insertarLista(int valorBuscarInsertar, int entrada){
        Nodo nuevo, anterior;
        anterior = buscarLista(valorBuscarInsertar);
        if(anterior != null){
            nuevo = new Nodo(entrada);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this; 
    }
    
    //buscar por posicion
    public Nodo buscarPosicion(int posicion){
        Nodo indice;
        int i;
        if(posicion < 0) return null;
        
        indice = primero;
        for(i=1;(i<posicion)&&(indice != null);i++){
            indice = indice.enlace;
        }
        return indice;
    }
    
    public void eliminar(int entrada){
        
        Nodo actual, anterior;
        boolean encontrado;
        //iniciar los apuntadores
        actual = primero;
        anterior = null;
        encontrado = false;
        //buscar en el nodo
        while((actual != null)&&(!encontrado)){
            encontrado = (actual.dato == entrada); //equals
            if(!encontrado){
                anterior = actual;
                actual = actual.enlace;
            }
        }
        
        //enlazar del nodo anterior con el siguiente nodo
        if(actual != null){
            //distingue que el nodo no sea la cabeza
            if(actual == primero){
                primero = actual.enlace;
            }else {
                anterior.enlace = actual.enlace;
            }
            actual = null; //ya que es una variable local, no es necesario
           
        }
        
    }
    
}
