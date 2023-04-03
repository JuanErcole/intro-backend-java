package servicesclasses.entities;

import java.util.concurrent.atomic.AtomicInteger;


public class CuentaBancaria {
    
    private static final AtomicInteger uid = new AtomicInteger(5432);

    // ATRIBUTOS
    private int numCuenta;
    private long dniCliente;
    private double saldoActual;
    
    // CONSTRUCTORES
    public CuentaBancaria() {
        numCuenta = uid.getAndIncrement();
        saldoActual = 0;
    }

    public CuentaBancaria( long dniCliente, double saldoActual) {
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        
        numCuenta = uid.getAndIncrement();
        saldoActual = 0;
    }
    
    
    // METODOS
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
    
    
    
}
