package Ejercicio_2_CuentaBancaria;
// Clase principal
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan Pérez", "1234567890");
        Cliente cliente2 = new Cliente("María López", "0987654321");

        CuentaBancaria cuenta1 = new CuentaCorriente("CC001", cliente1);
        CuentaBancaria cuenta2 = new CuentaAhorro("CA002", cliente2);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Ver información del cliente y saldo");
            System.out.println("2. Transferir entre cuentas");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Depositar dinero");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cuenta1.mostrarInformacion();
                    cuenta2.mostrarInformacion();
                    break;
                case 2:
                    System.out.print("Ingrese el monto a transferir: ");
                    double montoTransferir = scanner.nextDouble();
                    if (cuenta1.getSaldo() >= montoTransferir) {
                        cuenta1.retirar(montoTransferir);
                        cuenta2.depositar(montoTransferir);
                        System.out.println("Transferencia realizada con éxito.");
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;
                case 3:
                    System.out.print("Seleccione la cuenta (1 o 2): ");
                    int cuentaSeleccionada = scanner.nextInt();
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetirar = scanner.nextDouble();
                    if (cuentaSeleccionada == 1) {
                        cuenta1.retirar(montoRetirar);
                    } else if (cuentaSeleccionada == 2) {
                        cuenta2.retirar(montoRetirar);
                    } else {
                        System.out.println("Cuenta no válida.");
                    }
                    break;
                case 4:
                    System.out.print("Seleccione la cuenta (1 o 2): ");
                    cuentaSeleccionada = scanner.nextInt();
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDepositar = scanner.nextDouble();
                    if (cuentaSeleccionada == 1) {
                        cuenta1.depositar(montoDepositar);
                    } else if (cuentaSeleccionada == 2) {
                        cuenta2.depositar(montoDepositar);
                    } else {
                        System.out.println("Cuenta no válida.");
                    }
                    break;
                case 5:
                    System.out.println("¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}
