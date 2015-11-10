
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class ClockDisplay {

    private int hora;
    private int minuto;
    
    
    public ClockDisplay(int primerNumero,  int segundoNumero){
        if(primerNumero >= 00 && primerNumero <= 23){
        hora = primerNumero;
        if(segundoNumero >= 00 && segundoNumero <= 59){
        minuto = segundoNumero;
    }
    }
    
    }
    
    
    
    public void setTime(){
     System.out.println("Son las "+hora+" : "+minuto);
    
    }
    
    
    
    public void timeTick(){
        minuto=minuto+1;          
        if(minuto == 60){
             hora = hora + 1;
             minuto = 0;
             
             if(hora == 24){
                hora = 0;
            }
        
        }
        

        
    }
     public String getTime(){
        
        String horaDada;
        String minutosDados;
               
        horaDada = Integer.toString(hora);
        minutosDados = Integer.toString(minuto);
        
        if(hora < 10){
          horaDada = "0" + horaDada;
        }
        
        if(minuto < 10){
          minutosDados = "0" + minutosDados;
        }
        String time = horaDada + ":" + minutosDados;
        return time;
                
        }   
            
    
    
    


}