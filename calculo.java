
package com.mycompany.Herencia;



public class calculo extends Herencia {
    
      public String nombre= " ";
      
      public void nombre(String nombre){
          
          this.nombre= nombre;
          
          
         
          
          
      }
      
      public String get_nombre(){
        
          return nombre;
          
      }
      
      public void  set_nombre( String nombre){
          
          this.nombre =nombre;
         
    
      }
      
    public String dijitar(){
        
         System.out.println(" Nombre del cliente:"+ nombre);
         return nombre;
         
    }  
    
    }



