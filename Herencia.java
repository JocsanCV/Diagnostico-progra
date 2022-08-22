
package com.mycompany.Herencia;
import java.util.Scanner;


public class Herencia {

    public static void main(String[] args) {
        
        calculo nombre= new calculo();
        pagos agua= new pagos();
        
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese un Nombre");
        nombre.set_nombre (sc.nextLine());
        System.out.println("Ingrese el monto del producto");
        agua.set_monto_neto(sc.nextDouble());
        nombre.set_nombre(nombre.dijitar());
        nombre.get_nombre();
        agua.set_monto_total(agua.calculo_total());
        agua.get_monto_total();
        
        
        
      
        
      
    }
    
    
}
