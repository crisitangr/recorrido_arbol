
package recorridoarbol;

public class RecorridoArbol {

    public static void main(String[] args) {
        NodoArbol tree = new NodoArbol<Integer>();  //Nodo raiz (integer, no int)
        tree.setDato(45);  //valor de la raiz
        
        //tree.setHijo(new NodoArbol[] {new NodoArbol(23, null), new NodoArbol(11, null)});
        NodoArbol[] arrNodoArbol = { new NodoArbol(23, null), new NodoArbol(11, null)};  //valor del hijo izquierdo y derecho
  
        tree.setHijo(arrNodoArbol);  //asigna los hijos al nodo 
        
        
        tree.getHijo()[0].setHijo(0, 50);  //agrega hijo al nodo 23
        tree.getHijo()[1].setHijo(1, 40);  //agrega hijo al nodo 11 
        
        System.out.println("PreOrden:");
        tree.preOrden();  //ejecuta el metodo preOrden
        
        System.out.println("\nInOrden:");
        tree.inOrden();  //ejecuta el metodo inOrden
        
        System.out.println("\nPostOrden:");
        tree.postOrden();  //ejecuta el medodo postOrden
    }
}    
