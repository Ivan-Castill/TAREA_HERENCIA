package Ejercicio_2_CuentaBancaria;

public abstract class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;
    private Cliente cliente;

    public CuentaBancaria(double saldo, String numeroCuenta, Cliente cliente) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito exitoso. Saldo actual: $" + saldo);
    }

    public abstract void retirar(double monto);

    public void mostrarInformacion() {
        cliente.mostrarInformacion();
        System.out.println(" Número de Cuenta: " + numeroCuenta + "\n Saldo: $" + saldo);
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}