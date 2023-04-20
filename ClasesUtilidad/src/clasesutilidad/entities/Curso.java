package clasesutilidad.entities;

public class Curso {

    // ATRIBUTOS
    private String nombreCurso;
    private int cantidadHsDia;
    private int cantidadHsSemana;
    private String turno;
    private float precioHora;
    private String[] alumnos;

    // CONSTRUCTORES
    public Curso(String nombreCurso, int cantidadHsDia, int cantidadHsSemana, String turno, float precioHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHsDia = cantidadHsDia;
        this.cantidadHsSemana = cantidadHsSemana;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }

    public Curso() {
    }
    
    
    // METODOS
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHsDia() {
        return cantidadHsDia;
    }

    public void setCantidadHsDia(int cantidadHsDia) {
        this.cantidadHsDia = cantidadHsDia;
    }

    public int getCantidadHsSemana() {
        return cantidadHsSemana;
    }

    public void setCantidadHsSemana(int cantidadHsSemana) {
        this.cantidadHsSemana = cantidadHsSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }    
    
}
