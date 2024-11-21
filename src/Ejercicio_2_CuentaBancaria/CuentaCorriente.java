package Ejercicio_2_CuentaBancaria;

public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(String numeroCuenta, Cliente cliente) {
        super(1000.0, numeroCuenta, cliente);
    }

    @Override
    public void retirar(double monto) {
        double comision = monto * 0.02;
        if (getSaldo() >= (monto + comision)) {
            setSaldo(getSaldo() - (monto + comision));
            System.out.println(" Retiro exitoso \n Comisión aplicada: $" + comision + "\n Saldo actual: $" + getSaldo());
        } else {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        }
    }
}
