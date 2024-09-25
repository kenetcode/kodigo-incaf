package kodigo.modulo2.semana1.singleresponsibilityprinciple.gestiondecuentasbancarias;

import kodigo.modulo2.semana1.singleresponsibilityprinciple.gestiondetareas.GestionTareas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestionCuentas gestionCuentas = new GestionCuentas();
        CalculoIntereses calculoIntereses = new CalculoIntereses();
        List<CuentaBancaria> cuentas = new ArrayList<>();
        cuentas.add(gestionCuentas.crearCuenta("0019823453", 1000));
        gestionCuentas.deposito(cuentas.get(0), 25);
        gestionCuentas.consultarSaldo(cuentas.get(0));
        gestionCuentas.retiro(cuentas.get(0), 10);
        calculoIntereses.calcularInteres(cuentas.get(0), 5);
    }
}
