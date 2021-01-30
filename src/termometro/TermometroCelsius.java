
package termometro;


public class TermometroCelsius extends Termometro  {

    public TermometroCelsius(int grados) {
        super(grados);
    }
    
    @Override
    public String determinarTemperatura(){
       
        
         if(super.getGrados()< 38){
            
          return ("Temperatura normal "+super.getGrados()+ "°C");
        }else{
            
          return ("Fiebre "+ super.getGrados()+ "°C");
        }
         
    }
    
    @Override
    public double convertir(){    
        return (super.getGrados()*(1.8)+32);
    }
    
    @Override
     public String  toString(){
       return (super.toString()+"°C");
       
    }
}
