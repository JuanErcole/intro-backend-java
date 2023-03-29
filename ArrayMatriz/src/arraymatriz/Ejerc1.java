package arraymatriz;

public class Ejerc1 {
    public static void main(String[] args) {
        
        int[] vectorDeCien = new int[100];
        
        for (int i = 0; i < vectorDeCien.length; i++) {
            
            vectorDeCien[i] = i;
            
        }
        
        for (int i = vectorDeCien.length -1 ; i >= 0; i--) {
            
            System.out.println(vectorDeCien[i]);
            
        }
        
    }
}
