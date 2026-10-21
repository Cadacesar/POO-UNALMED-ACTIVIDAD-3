package notasestud;

public class NotasCalc {
    
    public double [] listaNotas;
    
    public NotasCalc() {
        listaNotas = new double[5];
    }
    
    
    public double calcProm() {
        
        double nota1 = listaNotas[0];
        double nota2 = listaNotas[1];
        double nota3 = listaNotas[2];
        double nota4 = listaNotas[3];
        double nota5 = listaNotas[4];
        
        return (nota1 + nota2 + nota3 + nota4 + nota5)/listaNotas.length;
    }
    
    public double calcDesvEst() {
        
        double prom = calcProm();
        double suma = 0;
        
        for(int i=0; i<listaNotas.length ; i++) {
            suma += Math.pow(listaNotas[i] - prom, 2);
        }
        return Math.sqrt(suma/listaNotas.length);
    }
    
    public double calcMenor() {
        
        double valMenor = listaNotas[0];
        
        for(int i=1; i<listaNotas.length; i++) {
            if (valMenor>listaNotas[i]) {
                valMenor = listaNotas[i];
            }
        }
        return valMenor;
    }
    
    public double calcMayor() {
        
        double valMayor = listaNotas[0];
        
        for(int i=1; i<listaNotas.length; i++) {
            if (valMayor<listaNotas[i]) {
                valMayor = listaNotas[i];
            }
        }
        return valMayor;
    }   
    
}
