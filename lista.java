/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;



import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class lista {
    public static void main(String [] args){
        String respuesta="";
        int respuestaN=0;
        vehiculo vehiculo=new vehiculo();
        boolean diff=true;
        while(diff=true){
        respuesta=JOptionPane.showInputDialog(null,"Seleccione una opcion\n1-Lista\n2-Filtrar por ruedas\n3-Salir");
       
        switch(respuesta){
                case "1":
                      respuesta=JOptionPane.showInputDialog(null,"Seleccione una opcion\n1-Carros\n2-Motocicletas\n3-Bicicletas\n4-Camionetas");
                      switch(respuesta){
                          case"1":
                               JOptionPane.showMessageDialog(null,"n-Toyota\n-Nissan\n-Camaro\n-Tesla");
                              break;
                                case"2":
                                     JOptionPane.showMessageDialog(null,"n-Yamaha\n-Suzuki\n-Harley\n-Toyota");
                              break;
                                case"3":
                                     JOptionPane.showMessageDialog(null,"n-bmx\n-Drake\n-Scott\n-Shimano");
                              break;
                                case"4":
                                     JOptionPane.showMessageDialog(null,"n-Toyota\n-Nissan\n-Camaro\n-Tesla");
                              break;
                      }
                    break;
                    case "2":
                        respuestaN=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de llantas"));
                        vehiculo.setruedas(respuestaN);
                        if(vehiculo.ruedas==2){
                              JOptionPane.showMessageDialog(null,"Motocicletas:\n-Yamaha\n-Suzuki\n-Harley\n-Toyota");
                               JOptionPane.showMessageDialog(null,"Bicicletas:\n-Bmx\n-Drake\n-Scott\n-Shimano");
                        }
                        if(vehiculo.ruedas==4){
                              JOptionPane.showMessageDialog(null,"Carros:\n-Toyota\n-Nissan\n-camaro\n-Tesla");
                             JOptionPane.showMessageDialog(null,"Camionetas:\n-Toyota\n-Nissan\n-Camaro"); 
                        }
                      
                    break;
                    case "3":
                        System.exit(0);
                    break;
        }
        }

    }   
}
