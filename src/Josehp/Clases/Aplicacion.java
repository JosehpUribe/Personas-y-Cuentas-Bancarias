package Josehp.Clases;

public class Aplicacion {
	 public static void main(String[] args) {
	        // Persona
	        Persona persona1 = new Persona("Juan", 30);
	        Persona persona2 = new Persona("María", 25);
	        Persona persona3 = new Persona("Pedro", 40);

	        // CuentaBancaria
	        CuentaBancaria cuenta1 = new CuentaBancaria(1000.0, persona1);
	        CuentaBancaria cuenta2 = new CuentaBancaria(2000.0, persona2);
	        CuentaBancaria cuenta3 = new CuentaBancaria(1500.0, persona3);

	        //  depósito y retiro
	        cuenta1.depositar(500.0);
	        cuenta2.retirar(300.0);
	        cuenta3.depositar(1000.0);
	        cuenta1.retirar(2000.0); // Extra Negado

	        // saldo actual 
	        System.out.println("\nSaldo actual de las cuentas:");
	        System.out.println("Cuenta 1: " + cuenta1.getSaldo());
	        System.out.println("Cuenta 2: " + cuenta2.getSaldo());
	        System.out.println("Cuenta 3: " + cuenta3.getSaldo());

	        //  información de todas las cuentas
	        System.out.println("\nInformación de todas las cuentas:");
	        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
	    }
}
