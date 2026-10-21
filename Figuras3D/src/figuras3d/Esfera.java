package figuras3d;

public class Esfera {
    
        public double radioE;
    
    public Esfera (double radioE) {
        this.radioE = radioE;
    }
    
    public double calcVol(){
        return (4*Math.PI*radioE*radioE*radioE)/3;
    }    
    
    public double calcSurf(){
        return 4*Math.PI*radioE*radioE;
    } 
    
}
