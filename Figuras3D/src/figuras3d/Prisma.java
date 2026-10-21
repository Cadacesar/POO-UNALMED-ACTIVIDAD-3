package figuras3d;

public class Prisma {
    
    public double baseP;
    public double alturaP;
    
    public Prisma(double baseP, double alturaP) {
        this.baseP = baseP;
        this.alturaP = alturaP;
    }
    
    public double calcVol(){
        return baseP*baseP*alturaP;
    }    
     
    public double calcSurf(){
        return (2*baseP*baseP) + (4*baseP*alturaP);
    }   
    
}
