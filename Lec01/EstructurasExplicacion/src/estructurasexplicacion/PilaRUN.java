package estructurasexplicacion;

public class PilaRUN {

    private static Nodo puntoreferencia = null;//Este no debe cambiar de referencia

    public static void agregarPila() {
        Dato dato = new Dato();
        dato.setNumero(102);
        Nodo n1 = new Nodo();
        n1.setDato(dato);
        if (puntoreferencia == null) {
            puntoreferencia = n1;
        } else {
            n1.setSiguiente(puntoreferencia); //102.setSiguiente(55);
            puntoreferencia = n1; // 25 -> 55 - > 102
        }
    }
}
