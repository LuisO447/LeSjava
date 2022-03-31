/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploColecciones;

import EjemploColecciones.EJColecciones;
import PkgEjemplo.ClsEjemplo;
import PkgListaPuntos.ClsAlumno;
import PkgListaPuntos.ClsLista;
import PkgListaPuntos.Listado;


/**
 *
 * @author Luis
 */
public class Principal {
    
    public static void FuncionInsertar(){
        
        String nomb, carnet, prom;
        double pro;
        
        Listado lista = new Listado();
        nomb = "juan";
        carnet = "0905";
        prom = "88";
        pro = Double.parseDouble(prom);
        lista.insertar(new ClsAlumno("Juan","0905",88));
        
        Listado lista1 = new Listado();
        
        String nomb1 = "Diana";
        String carnet1 = "0904";
        String prom1 = "85";
        double pro1 = Double.parseDouble(prom1);
        lista.insertar(new ClsAlumno("Diana","0904",85));
        
        
        Listado lista2 = new Listado();
        String nomb2 = "Marlon";
        String carnet2 = "0903";
        String prom2 = "95";
        double pro2 = Double.parseDouble(prom2);
        lista.insertar(new ClsAlumno("Marlon","0903",95));
               
        Listado lista3 = new Listado();
        String nomb3 = "Billy";
        String carnet3 = "0902";
        String prom3 = "75";
        double pro3 = Double.parseDouble(prom3);
        lista.insertar(new ClsAlumno("Billy","0902",75));
        
        lista.visualizar();
    }
    
    public static void BuscarNodo(){
        
        //FuncionInsertar();
        Listado lista = new Listado();
        String carnetB = "0905";
        System.out.println("Buscando...");
        lista.buscarAlumno(carnetB);
        
    }
    
    public static void Eliminar(){
        
        //FuncionInsertar();
        Listado ls = new Listado();
        String carnetC = "0902";
        System.out.println("Eliminando nodo...");
        ls.borrarAlumno(carnetC);
        
    }

    public static void main(String[] args) {
        
        System.out.println("-----Insertando y mostrando datos-----");
        FuncionInsertar();
        System.out.println("-----Buscando el dato en el nodo-----");
        BuscarNodo();
        System.out.println("-----Funcion de eliminar-----");
        Eliminar();
        System.out.println("-----Fin del programa-----");
    }

}
