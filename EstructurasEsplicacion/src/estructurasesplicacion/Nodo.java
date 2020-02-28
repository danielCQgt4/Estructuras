
package estructurasesplicacion;
public class Nodo {
    
    private Dato dato;
    private Nodo siguiente;
    
    public Nodo(){
    }

    public Dato getDato() {
        return dato;
    }

    //Panfilo
    public void setDato(Dato panfilo) {
        this.dato = panfilo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
