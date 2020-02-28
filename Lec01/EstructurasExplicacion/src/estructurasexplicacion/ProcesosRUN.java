package estructurasexplicacion;

public class ProcesosRUN {

    private Nodo puntoreferencia;

    public static void comoAgregarDatosEstructura() {
        //Creacion de nodos y datos
        Dato panfilo = new Dato();
        panfilo.setNumero(305230724);
        Nodo nodo = new Nodo();
        nodo.setDato(panfilo);//Segunda parte del papelito

        Dato dato1 = new Dato();
        dato1.setNumero(305220013);
        Nodo nodo1 = new Nodo();
        nodo1.setDato(dato1);//Segunda parte del papelito

        Dato dato2 = new Dato();
        dato2.setNumero(111111111);
        Nodo nodo2 = new Nodo();
        nodo2.setDato(dato2);//Segunda parte del papelito

        //Asignacion de referencias
        nodo.setSiguiente(nodo1);//Tercera parte del papelito
        nodo1.setSiguiente(nodo2);

        System.out.println(nodo.getDato().getNumero());
        System.out.println(nodo.getSiguiente().getDato().getNumero());
        System.out.println(nodo.getSiguiente().getSiguiente().getDato().getNumero());
    }
}
