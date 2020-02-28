package explicacionobjetosreferenciamemoria;

public class Main {

    public static void main(String[] args) {
        crearObjectosDistitos();
        /*p1.setCedula(305230724);// Ojo con esto, esto tiene que ver con el ambito de las variable y atributos
        Sytem.out.println(p1.getCedula());*/
        crearObjectosIguales();
    }

    public static void crearObjectosDistitos() {
        Persona p = new Persona();
        p.setCedula(305230724);
        p.setNombre("Daniel");
        p.setEdad(19);
        System.out.println("Estamos desde p: " + p);

        Persona p1 = new Persona();
        p1.setCedula(30522013);
        p1.setEdad(19);
        p1.setNombre("alex");
        System.out.println("Estamos desde p1: " + p1);
    }

    public static void crearObjectosIguales() {
        Persona p = new Persona();
        p.setCedula(305230724);
        p.setNombre("Daniel");
        p.setEdad(19);
        System.out.println("Estamos desde p: " + p);

        Persona p3 = p;
        p3.setNombre("alex");
        System.out.println("Estamos desde p3: " + p3);
        System.out.println("Estamos desde p: " + p);

        Persona p4 = p;
        p3.setNombre("Maria");
        System.out.println("Estamos desde p: " + p);
        System.out.println("Estamos desde p3: " + p3);
        System.out.println("Estamos desde p4: " + p4);
    }
}