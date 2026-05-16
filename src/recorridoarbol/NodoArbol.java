
package recorridoarbol;

public class NodoArbol<T> {
    private T dato;
    private NodoArbol[] hijo;

    public NodoArbol(T dato, NodoArbol[] hijo) {
        this.dato = dato;
        this.hijo = hijo;
    }

    NodoArbol() {
    }

    public T getDato() {
        return dato;
    }

    public NodoArbol[] getHijo() {
        return hijo;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setHijo(NodoArbol[] hijo) {
        this.hijo = hijo;
    }
    
    public void setHijo(int pos, T dato){ 
        NodoArbol[] nuevoHijo = new NodoArbol[pos + 1]; 
        
        nuevoHijo[pos] = new NodoArbol(dato, null);
        
        this.hijo = nuevoHijo; 
    }

    public void preOrden() {
        System.out.print(this.dato+ ", ");
        if (hijo == null) return;
         for (NodoArbol n : hijo) {
             if (n != null)
           
            n.preOrden();
        }
    }
    public void inOrden() {
        if (hijo != null && hijo.length > 0 && hijo[0] != null){
            hijo[0].inOrden();
        }
        System.out.print(this.dato + ", ");
        
        if (hijo!= null && hijo.length > 1 && hijo[1] != null){
            hijo[1].inOrden();
        }
    }
    public void postOrden() {
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