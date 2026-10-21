package figuras3d;

public class Cubo {
    
    public double ladoC;
    
    public Cubo (double ladoC) {  
        this.ladoC = ladoC;
    }
    
    public double calcVol(){
        return Math.pow(ladoC,3);
    }    
     
    public double calcSurf(){
        return 6*Math.pow(ladoC,2);
    }    
    
}
