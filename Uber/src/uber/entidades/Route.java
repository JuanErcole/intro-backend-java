package uber.entidades;

import java.util.ArrayList;


public class Route {

   // ATRIBUTOS
   private int id;
   ArrayList<Double> start;
   ArrayList<Double> end;
   
   
   
   // CONSTRUCTORES
    public Route(int id, ArrayList<Double> start, ArrayList<Double> end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }
    
    
    
    //METODOS
    public ArrayList<Double> getStart() {
        return start;
    }

    public void setStart(ArrayList<Double> start) {
        this.start = start;
    }

    public ArrayList<Double> getEnd() {
        return end;
    }

    public void setEnd(ArrayList<Double> end) {
        this.end = end;
    }
    
   
    
}
