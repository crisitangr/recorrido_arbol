
package recorridoarbol;

public class RecorridoArbol {

    public static void main(String[] args) {
        NodoArbol tree = new NodoArbol<Integer>();
        tree.setDato(45);
        
        //tree.setHijo(new NodoArbol[] {new NodoArbol(23, null), new NodoArbol(11, null)});
        NodoArbol[] arrNodoArbol = { new NodoArbol(23, null), new NodoArbol(11, null)};
  
        tree.setHijo(arrNodoArbol);
        
        
        tree.getHijo()[0].setHijo(0, 50);
        tree.getHijo()[1].setHijo(1, 40);
        tree.preOrden();
        
        System.out.println("\nInOrden:");
        tree.inOrden();
        
        System.out.println("\nPostOrden:");
        tree.postOrden();
    }
}    
