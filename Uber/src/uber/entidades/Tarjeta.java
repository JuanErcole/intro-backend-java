package uber.entidades;

import java.util.Date;

public class Tarjeta extends Payment{

    private int numero;
    private int cvv;
    private Date expiracion;

    public Tarjeta(int numero, int cvv, Date expiracion) {
        this.numero = numero;
        this.cvv = cvv;
        this.expiracion = expiracion;
    }
    
    
    
    
}
