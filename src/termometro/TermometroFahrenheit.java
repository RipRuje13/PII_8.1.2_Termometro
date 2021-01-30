
package termometro;


public class TermometroFahrenheit extends Termometro  {

    public TermometroFahrenheit(int grados) {
        super(grados);
    }
    
    @Override
    public String determinarTemperatura(){
          String r;
        if(super.getGrados() < 100.4){
            
            r = ("Temperatura normal "+ super.getGrados()+ "°F");
        }else{
            
            r = ("Fiebre "+ super.getGrados()+ "°F");
        }
        
        return r;
    }
    
    @Override
    public double convertir(){
         return ((super.getGrados()-32)*0.555555556);
    }
    
    @Override
    public String  toString(){
       return (super.toString()+"°F");
       
    }

    
}
