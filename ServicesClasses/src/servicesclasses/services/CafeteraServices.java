package servicesclasses.services;

import servicesclasses.entities.Cafetera;

public class CafeteraServices {

    public void llenarCafetera(Cafetera cafetera) {
        int actual = cafetera.getCapacidadMaxima();
        cafetera.setCantidadActual(actual);
    }

    public void servirTaza(Cafetera cafetera, String tamanio) {

        int taza = 0;
        int currentQuantity = cafetera.getCantidadActual();
        tamanio = tamanio.toLowerCase();
        int restante;

        switch (tamanio) {
            case "small":
                taza = 200;
                // 150 ml
                break;
            case "medium":
                taza = 400;
                //300 ml
                break;
            case "large":
                taza = 600;
                //500 ml
                break;
        }

        if (taza > currentQuantity) {
            System.out.println("Lo siento, solo quedaba en la cafetera " + currentQuantity + " ml");
            cafetera.setCantidadActual(0);
            return;
             
        }

        restante = currentQuantity - taza;
        cafetera.setCantidadActual(restante);

        System.out.println("Aqui tiene su taza llena");
        System.out.println("Cantidad restante = " + restante + "ml");
    }

    public void vaciarCafetera(Cafetera caf) {
        caf.setCantidadActual(0);
        System.out.println("Cafetera vaciada");
    }

    public void agregarCafe(Cafetera caf, int cant) {

        int currentQuantity = caf.getCantidadActual();  // 800
        int maxQuantity = caf.getCapacidadMaxima();     //1000
        int total = currentQuantity + cant;             //800 + cant (250)

        if (total > maxQuantity) {
            System.out.println("No puede execeder la capacidad maxima");
            return;
        }

        caf.setCantidadActual(total);
        System.out.println("su cafetera tiene un total de " + caf.getCantidadActual() + " ml de cafe");
    }

}
