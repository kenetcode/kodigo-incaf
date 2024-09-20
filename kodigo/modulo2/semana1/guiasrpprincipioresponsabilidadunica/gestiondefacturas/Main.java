package kodigo.modulo2.semana1.guiasrpprincipioresponsabilidadunica.gestiondefacturas;

public class Main {
    public static void main(String[] args) {
        // Crear objeto de la clase GestionFacturas
        GestionFacturas gestionFacturas = new GestionFacturas();
        // Agregar facturas
        gestionFacturas.agregarFactura(new Factura("001", 100, "Juan", "Si", "Si"));
        gestionFacturas.agregarFactura(new Factura("002", 200, "Pedro", "No", "No"));
        gestionFacturas.agregarFactura(new Factura("003", 300, "Maria", "Si", "No"));
        gestionFacturas.agregarFactura(new Factura("004", 400, "Jose", "No", "Si"));
        // Listar facturas
        gestionFacturas.listarFacturas();
    }
}
