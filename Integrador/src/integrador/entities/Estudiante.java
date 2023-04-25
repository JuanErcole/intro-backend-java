package integrador.entities;

public class Estudiante {
    
    // ATRIBUTOS
    private String nombre;
    private double nota;
    
    
    // CONSTRUCTORES
    public Estudiante() {
    }

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    // METODOS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
}
