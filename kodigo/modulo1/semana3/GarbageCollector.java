package kodigo.modulo1.semana3;

public class GarbageCollector {
    public static void main(String[] args) {
        String hola = "Hola";

        int ref1 = System.identityHashCode(hola);
        System.out.println("Primera pasada");
        System.out.println("codigo: " + ref1);

        hola = "Dos hola";

        ref1 = System.identityHashCode(hola);
        System.out.println("Segunda pasada");
        System.out.println("codigo: " + ref1);
    }
}
