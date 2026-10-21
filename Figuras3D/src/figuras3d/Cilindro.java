package figuras3d;

public class Cilindro {
    
    public double radioC;
    public double alturaC;
    
    public Cilindro(double radioC, double alturaC) {
        this.radioC = radioC;
        this.alturaC = alturaC;
    }
    
    public double calcVol(){
        return Math.PI*radioC*radioC*alturaC;
    }
    
    public double calcSurf(){
        return (2*Math.PI*radioC*alturaC) + (2*Math.PI*radioC*radioC);
    } 
    
}
