package figuras3d;

public class Piramide {
    
    public double baseP;
    public double alturaP;
    public double apotema;
    
    public Piramide (double baseP, double alturaP, double apotema) {
        this.baseP = baseP;
        this.alturaP = alturaP;
        this.apotema = apotema;
    }
    
    public double calcVol(){
        return (4*baseP*baseP*alturaP)/3;
    }    
     
    public double calcSurf(){
        return (4*baseP*baseP) + (4*baseP*apotema);
    }     
    
}
