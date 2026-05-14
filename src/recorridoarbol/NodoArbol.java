
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
    
    public void setHijo(int pos, T dato) {
        
    }

    public void preOrden() {
        System.out.print(this.dato);
        if (hijo == null) return;
        for (NodoArbol n : hijo) {
            System.out.print(", ");
            n.preOrden();
        }
    }
}