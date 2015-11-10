------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:


public class ClockDisplay {

    privete int hora;
    private int minuto;
    
    
    public ClockDisplay(int primerNumero,  int segundoNumero){
        
        hora = primerNumero;
        minuto = segundoNumero;
    
    
    }
    
    
    
    public void setTime(){
     System.out.println("Son las "+hora+" : "+minuto);
    
    }
    
    
    
    public void timeTick(){
        minuto=minuto+1; 
        if(hora == 24){ 
            hora = 0;  
        }
        
        if(minute == 60)
            minute = 0;
    }
    
    


}