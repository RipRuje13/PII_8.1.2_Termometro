
package termometro;


abstract public class Termometro implements Temperatura,Estadistica {
    int n;
    private double grados;
    
    double memoria[]=new double[5];
   
    

    public Termometro(double grados) {
        this.grados = grados;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }
    
    abstract public double convertir();
    
    public void guardaEnmemoria(){
      
            memoria[n]= grados;
            n++;
        }
        
   
    
    public void resetearMemoria(){
         for(int n=0;n<5;n++)
            memoria[n]= 0;
              
    }
    
    public String imprimirMemoria(){

       
        return ("Las temperaturas son:"+ memoria[n]);
              
      }
 
    @Override
    public String toString(){
        return ("La temperatura actual es:" + grados);
    }
    
    @Override
    public double minimo(){
        
        double min;
        min = memoria[0];
        for(int i=0; i<5;i++){
            if(memoria[i]<min)
               min = memoria[i];
        }
        
        return min;
        
        }
        
  
    
    @Override
    public double maximo(){
         double max=0;
        max = memoria[0];
        for(int i=0; i<5;i++){
            if(memoria[i]>max)
               max = memoria[i];
            }
          return max;
          
        }
}
        
 

