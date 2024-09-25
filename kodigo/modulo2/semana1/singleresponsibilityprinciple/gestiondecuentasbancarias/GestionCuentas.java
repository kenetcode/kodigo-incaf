package kodigo.modulo2.semana1.singleresponsibilityprinciple.gestiondecuentasbancarias;

public class GestionCuentas {
    public CuentaBancaria crearCuenta(String numeroCuenta, double saldo){
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Cuenta creada con exito");
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo: $" + cuenta.getSaldo());
        return cuenta;
    }
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Esta consultando el saldo de la cuenta con numero: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo de la cuenta: $" + cuenta.getSaldo());
    }
    public void deposito(CuentaBancaria cuenta, double valor){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Usted depositara la cantidad de $" + valor + " a la cuenta con numero " + cuenta.getNumeroCuenta());
        cuenta.setSaldo(cuenta.getSaldo() + valor);
        System.out.println("Saldo total de la cuenta $" + cuenta.getSaldo() );
    }
    public void retiro(CuentaBancaria cuenta, double valor){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Usted retirara la cantidad de $" + valor + " de la cuenta con numero " + cuenta.getNumeroCuenta());
        cuenta.setSaldo(cuenta.getSaldo() - valor);
        System.out.println("Saldo total de la cuenta $" + cuenta.getSaldo() );
    }
}
