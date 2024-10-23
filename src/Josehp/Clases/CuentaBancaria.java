package Josehp.Clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
	 private double saldo;
	    private Persona titular;
	    private int numeroCuenta;
	    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();
	    
	 // Constructor
	    public CuentaBancaria(double saldo, Persona titular) {
	        this.saldo = saldo;
	        this.titular = titular;
	        this.numeroCuenta = generarNumeroCuenta();
	        listaDeCuentasBancarias.add(this);
	    }
	    private int generarNumeroCuenta() {
	        Random random = new Random();
	        return 100000 + random.nextInt(900000); 
	    }
	  // Getters y Setters
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public Persona getTitular() {
			return titular;
		}
		public void setTitular(Persona titular) {
			this.titular = titular;
		}
		public int getNumeroCuenta() {
			return numeroCuenta;
		}
	// Operador de cuenta 
		 public void depositar(double monto) {
		        if (monto > 0) {
		            saldo += monto;
		            System.out.println("Depositados: " + monto + ". Saldo actual: " + saldo);
		        } else {
		            System.out.println("Monto inválido para depositar.");
		        }
		    }

		    public void retirar(double monto) {
		        if (monto > 0 && monto <= saldo) {
		            saldo -= monto;
		            System.out.println("Retirados: " + monto + ". Saldo actual: " + saldo);
		        } else {
		            System.out.println("Fondos insuficientes o monto inválido para retirar.");
		        }
		    }

		    public void despliegaInformacion() {
		        System.out.println("Número de cuenta: " + numeroCuenta + ", Saldo: " + saldo);
		        System.out.print("Titular: ");
		        titular.despliegaInformacion();
		    }

		    public static void imprimeInformacionDeTodasLasCuentas() {
		        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
		            cuenta.despliegaInformacion();
		        }
		    }
}
