/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploColecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author Luis
 */
public class EJColecciones {
    
    public void EjArrayList() {
        Collection<Integer> list1 = new ArrayList<Integer>(5);
        list1.add(15);
        list1.add(20);
        list1.add(25);

//imprimir los elementos
        for (Integer numero : list1) {
            System.out.println("Numero = " + numero);
        }

//crear otro
        Collection<Integer> list2 = new ArrayList<Integer>();

        list2.addAll(list1);

        System.out.println("Nuevo array list=" + list2);
        //ejemplo de implementaci[on del SET

    }
    
    public void EjSet() {
        Collection<Integer> set1 = new HashSet<Integer>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("Valor inicial del set1=" + set1);
//eliminar un elemento particular
        set1.remove(4);
        System.out.println("Valor removido 4 del set1=" + set1);
        Collection<Integer> set2 = new HashSet<Integer>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        System.out.println("Elementos que se quitaran= " + set2);
        set1.removeAll(set2);
        System.out.println("Elementos del set1 que quedaron" + set1);
    }
    
}
