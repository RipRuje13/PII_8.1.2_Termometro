//Lizbeth Evelin  Barranco Morales
//Rogelio Adrian Noriega Luna
package termometro;
import java.util.Scanner;
public class Ptermometro {
    
    public static void main(String[] args) {
        
        int i=0,opc ,opc1,res;
         Scanner sc = new Scanner (System.in);
         Termometro tr[] = new Termometro [5];
           
         System.out.println("elija un termómetro:\n 1.Fahrenheit \n 2.Celsius.");
         opc = sc.nextInt();
         System.out.println("Deme los grados");
         res = sc.nextInt();
         
         if(opc == 1){
            tr[i]= new TermometroFahrenheit(res);
          }
          if(opc == 2){
             tr[i]= new TermometroCelsius(res);
          }
        
        do{
            System.out.println("\nMenu");
            System.out.println("1. Leer temperatura (Actualizar)");
            System.out.println("2. Convertir los grados. "); 
            System.out.println("3. Determinar temperatura.");
            System.out.println("4. Almacenar temperatura: Se almacena en la memoria del termómetro.");
            System.out.println("5. Mostrar la temperatura mínima leída.");
            System.out.println("6. Mostrar la temperatura máxima leída.");
            System.out.println("7. Resetear memoria del termómetro.");
            System.out.println("8. Salir");
            System.out.println("Dijite su eleccion");
            opc1=sc.nextInt();
               
            switch(opc1){
                
                case 1: 
                    System.out.println("Deme el numero de grados");
                    double g = sc.nextDouble();
                    tr[i].setGrados(g);  
                break; 
                
                case 2:  
                    if(tr[i] instanceof TermometroFahrenheit ){
                        ((TermometroFahrenheit)tr[i]).convertir();
                        System.out.println("La conversion de grados fue: " + tr[i].convertir() + "°C");
                    }
                    if(tr[i] instanceof TermometroCelsius ){
                        ((TermometroCelsius)tr[i]).convertir();
                        System.out.println("La conversion de grados fue: " + tr[i].convertir() + "°F");
                    }                                                    
                break;
                      
                case 3:
                    System.out.println(tr[i].determinarTemperatura());  
                break;
                       
                case 4:
                    tr[i].guardaEnmemoria();
                    System.out.println("Se guardo co exito");         
                break;
                        
                case 5: 
                    System.out.println("El minimo guardado fue: " + tr[i].minimo() );    
                break;     
                
                case 6:
                    System.out.println("El maximo guardado fue: " + tr[i].maximo() );
                break;
                        
                case 7:
                    tr[i].resetearMemoria();
                    System.out.println("Reseteado exitoso");                  
                break;
            }                
        }while(opc1 != 8);                                          
    }      
}
