package servicesclasses.services;

import java.util.Scanner;
import servicesclasses.entities.CuentaBancaria;


public class CuentaBancariaServicios{

    // CREAR CUENTA
    public CuentaBancaria createAccount(){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("ingrese su DNI");
        long dni = read.nextLong();
        
        
        
        System.out.println("Cuenta creada con exito");
        return new CuentaBancaria(dni );   
    }
    
    // INGRESAR DINERO
    public void ingresar(CuentaBancaria cuentaBanc, double cantidad){
       
        double saldoActual = cuentaBanc.getSaldoActual();
        cuentaBanc.setSaldoActual(saldoActual + cantidad);
    }
    
    public void retirar(CuentaBancaria cuentaBanc, double cantidad){
      
        double saldoActual = cuentaBanc.getSaldoActual();
        
        if ( saldoActual < cantidad){
            System.out.println("Saldo insuficiente");
            return;
         }
        
        cuentaBanc.setSaldoActual(saldoActual - cantidad);
    }
    
    public void extraccionRapida(CuentaBancaria cuentaBanc){
        
        double saldoActual = cuentaBanc.getSaldoActual();
        double extraccion = saldoActual * 0.20;
        
        cuentaBanc.setSaldoActual(saldoActual - extraccion);
    }
    
    public void consultarSaldo(CuentaBancaria cuentaBanc){
        
        double saldoActual = cuentaBanc.getSaldoActual();
        
        System.out.println("Su Saldo actual es de: $" +saldoActual);
    }
    
    public void consultarDatos(CuentaBancaria cuentaBanc){
        int id = cuentaBanc.getNumCuenta();
        long docTitular = cuentaBanc.getDniCliente();
        double saldo = cuentaBanc.getSaldoActual();
        
        System.out.println("ID de la Cuenta: "+id+" DNI del titular de la cuenta: "+docTitular+" Saldo: "+saldo);
    }
    
    
}
