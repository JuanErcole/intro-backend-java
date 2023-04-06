package servicesclasses;

import servicesclasses.entities.Cafetera;
import servicesclasses.entities.CuentaBancaria;
import servicesclasses.services.CafeteraServices;
import servicesclasses.services.CuentaBancariaServicios;


public class ServicesClasses {


    public static void main(String[] args) {
        
        /* ej 1
        CuentaBancariaServicios cbs = new CuentaBancariaServicios();
        CuentaBancaria c1 = cbs.createAccount();
        cbs.ingresar(c1, 50000);
        cbs.retirar(c1, 800);
        cbs.extraccionRapida(c1);
        cbs.consultarSaldo(c1);
        cbs.consultarDatos(c1);
        */
        
        CafeteraServices cs = new CafeteraServices();
        Cafetera c = new Cafetera(1000);
        
        cs.llenarCafetera(c);
        cs.servirTaza(c, "small");
        cs.agregarCafe(c, 250);
        cs.vaciarCafetera(c);
        
        
    }
    
}
