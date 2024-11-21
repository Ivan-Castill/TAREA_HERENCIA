package Ejercicio_2_CuentaBancaria;

public class CuentaAhorro extends CuentaBancaria {
    public CuentaAhorro(String numeroCuenta, Cliente cliente) {
        super(500.0, numeroCuenta, cliente);
    }

    @Override
    public void retirar(double monto) {
        if (getSaldo() - monto >= 100) {
            setSaldo(getSaldo() - monto);
            System.out.println("Retiro exitoso. Saldo actual: $" + getSaldo());
        } else {
            System.out.println("No se puede retirar. El saldo debe ser mayor o igual a $100.");
        }
    }
}