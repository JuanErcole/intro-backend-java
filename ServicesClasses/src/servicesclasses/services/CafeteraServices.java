package servicesclasses.services;

import servicesclasses.entities.Cafetera;


public class CafeteraServices {

    public void llenarCafetera(Cafetera cafetera){
        int actual = cafetera.getCapacidadMaxima();
        cafetera.setCantidadActual(actual);
    }
    
}
