package servicesclasses.entities;


public class Cafetera {

    // ATRIBUTOS
    private int capacidadMaxima;
    private int cantidadActual;

    // CONSTRUCTORES
    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    
    // METODOS 

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
    
    
    
    
}
