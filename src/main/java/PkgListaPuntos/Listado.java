
package PkgListaPuntos;

/**
 *
 * @author Luis
 */
public class Listado {
    
    public ClsNodo cabeza;
    public ClsNodo finalLista;
    
    public Listado(){
        cabeza = null;
        finalLista = null;
    }
    
    public boolean estaVacia(){
        
        if(cabeza == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertar(ClsAlumno alumno){
        ClsNodo actual;
        if(estaVacia()){
            actual = new ClsNodo(alumno,null,null);
            cabeza = actual;
            finalLista = actual;
        }else{
            actual = new ClsNodo(alumno,null,null);
            finalLista.setSiguiente(actual);
            finalLista = actual;
        }
        
    }
    
    public void borrarAlumno(String carnet){
        
        ClsNodo actual, anterior;
        boolean encontrado;
        //iniciar los apuntadores
        actual = cabeza;
        anterior = null;
        encontrado = false;
        //buscar en el nodo
        while((actual != null)&&(!encontrado)){
            encontrado = actual.equals(carnet); //equals
            if(!encontrado){
                anterior = actual;
                actual = actual.enlace;
            }
        }
        
        //enlazar del nodo anterior con el siguiente nodo
        if(actual != null){
            //distingue que el nodo no sea la cabeza
            if(actual == cabeza){
                cabeza = actual.enlace;
            }else {
                anterior.enlace = actual.enlace;
            }
            actual = null; //ya que es una variable local, no es necesario
           
        }
    }
    
    public void visualizar(){
        
        if(estaVacia()){
            System.out.println("La lista esta vacia");
            return;
        }else{
            ClsNodo temporal;
            temporal = cabeza;
            while(temporal!=null){
                System.out.println(temporal.getDato().toString()); //ver si se necesita el to string, si no borrar
                temporal = temporal.getSiguiente();
            }
        }   
    }
    
    public void buscarAlumno(String carnet){
        
        //if(estaVacia()){
          //  System.out.println("La lista de busqueda esta vacia");
            //return;
        //}else{
            ClsNodo temporal;
            temporal = cabeza;
            while(temporal!=null){
                if(carnet.equals(temporal.getDato().getcarnet())){
                    System.out.println(temporal.getDato().toString());
                    break;
                }
                temporal = temporal.getSiguiente();
            }
        //} 
        
    }
    
//    public void eliminarX(String carnet){
//        
//        ClsNodo temporal;
//        while(cabeza != null){
//            if(carnet == cabeza.getSiguiente().getDato().getcarnet()){
//                temporal = cabeza;
//                break;
//            }
//            cabeza=cabeza.getSiguiente();
//        }
//        
//        ClsNodo temporalpasado = cabeza;
//        temporal = cabeza.getSiguiente().getSiguiente();
//        temporalpasado.setSiguiente(temporal);
//        cabeza=temporalpasado;
//    }
    
}
