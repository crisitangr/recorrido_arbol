
package recorridoarbol;

public class NodoArbol<T> {  //Clase geérica (nodo del arbol)
    private T dato;   // Varlable que guarda el dato del nodo
    private NodoArbol[] hijo;  //Arreglo que guarda los hijos del nodo

    public NodoArbol(T dato, NodoArbol[] hijo) {  //constructor
        this.dato = dato;  //Guarda el dato recibido del nodo
        this.hijo = hijo;  //Guarda los hijos
    }

    NodoArbol() { //constructor vacio
    }

    public T getDato() {  //metodo get (nodo)
        return dato;
    }

    public NodoArbol[] getHijo() { //metodo get (hijos)
        return hijo;
    }

    public void setDato(T dato) {  //Metodo set (nodo)
        this.dato = dato;
    }

    public void setHijo(NodoArbol[] hijo) {  //metodo set (hijos)
        this.hijo = hijo;
    }
    
    public void setHijo(int pos, T dato){ 
        NodoArbol[] nuevoHijo = new NodoArbol[pos + 1]; 
        
        nuevoHijo[pos] = new NodoArbol(dato, null);
        
        this.hijo = nuevoHijo; 
    }

    public void preOrden() {  // metodo preOrden
        System.out.print(this.dato+ ", ");
        if (hijo == null) return;
         for (NodoArbol n : hijo) {
             if (n != null){
                 n.preOrden();
             }
        }
    }
    public void inOrden() {  //metodo inOrden
        if (hijo != null && hijo.length > 0 && hijo[0] != null){
            hijo[0].inOrden();
        }
        System.out.print(this.dato + ", ");
        
        if (hijo!= null && hijo.length > 1 && hijo[1] != null){
            hijo[1].inOrden();
        }
    }
    public void postOrden() {  //metodo postOrden
        if (hijo != null) {
            for (NodoArbol n : hijo) {
                if (n != null) {
                    n.postOrden();
                }
            }
        }
        System.out.print(this.dato + ", ");
    }
}