package ejerciciospoo.entidades;

public class Cancion {

    //ATRIBUTOS
    private String titulo;
    private String autor;

    

    // CONSTRUCTORES
    public Cancion() {
        titulo = "";
        autor = "";
    }

    public Cancion(String titulo, String autor) {

        this.titulo = titulo;
        this.autor = autor;

    }
    
    
    //METODOS DE CONSULTA Y MODIFICADORES
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    //METODOS OPERACIONALES
    public String presentacion(){
        return "Cancion: " + titulo + " ---- " + " autor: " + autor;
    }
    

}
