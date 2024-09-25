package kodigo.modulo2.semana1.singleresponsibilityprinciple.gestiondecuentasbancarias;

public class CalculoIntereses {
    public void calcularInteres(CuentaBancaria cuenta, double interes){
        double interesDeCuenta = cuenta.getSaldo() * (interes/100);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Se esta calculando el interes a la cuenta con numero: " + cuenta.getNumeroCuenta());
        System.out.println("El interes de la cuenta es: $"  + interesDeCuenta);
        cuenta.setSaldo(interesDeCuenta + cuenta.getSaldo());
        System.out.println("El saldo de la cuenta ahora es: $" + cuenta.getSaldo());
    }
}