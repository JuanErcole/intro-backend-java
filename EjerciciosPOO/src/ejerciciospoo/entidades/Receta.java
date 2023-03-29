package ejerciciospoo.entidades;

public class Receta {

    // ATRIBUTOS
    private String name;
    private String[] ingredientes;
    private String descripcion;

    
    // CONSTRUCTORES
    public Receta() {
    }

    public Receta(String name, String[] ingredientes, String descripcion) {
        this.name = name;
        this.ingredientes = ingredientes;
        this.descripcion = descripcion;
    }
    
    
    
    //METODOS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
