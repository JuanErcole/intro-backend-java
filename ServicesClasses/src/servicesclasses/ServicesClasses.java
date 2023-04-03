package servicesclasses;

import servicesclasses.entities.CuentaBancaria;
import servicesclasses.services.CuentaBancariaServicios;


public class ServicesClasses {


    public static void main(String[] args) {
        
        CuentaBancariaServicios cbs = new CuentaBancariaServicios();
        
        CuentaBancaria c1 = cbs.createAccount();
        cbs.ingresar(c1, 50000);
        cbs.retirar(c1, 800);
        cbs.extraccionRapida(c1);
        cbs.consultarSaldo(c1);
        cbs.consultarDatos(c1);
        
        
        
    }
    
}
