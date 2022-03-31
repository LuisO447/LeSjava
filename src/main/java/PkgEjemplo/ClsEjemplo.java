/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgEjemplo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Luis
 */
public class ClsEjemplo {
    
    public void ejemplo1() {
        String[] arreglo = { "Zacarias", "Maria", "Betty", "Fabrizio" };

        List<String> miLista = Arrays.asList(arreglo);
        ImprimirTodo(miLista);

        // ImprimirTodo mi lista

        Collections.sort(miLista);
        System.out.println("Ordenado : " + miLista);
        int donde = Collections.binarySearch(miLista, "Fabrizio");

        System.out.println("Fabrizio esta en " + donde);

        Collections.shuffle(miLista);
        System.out.println("Desordenados : " + miLista);

        System.out.println("Fin");
    }

    public void ImprimirTodo(Collection coll) {
        Iterator iter = coll.iterator();

        while (iter.hasNext()) {
            System.out.println("Elemento=" + iter.next());
        }
    }
}
