/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_eae;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author malcolmx
 */
public class data {
    ArrayList<String> cadena=new ArrayList(); //Almacena datos en cadena (String)
    ArrayList<Double> shell=new ArrayList(); // Alamcena Nuemors flotantes 
    Date now = new Date(System.currentTimeMillis()); // Añade calendario con hora y fecha
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd"); // Añade fecha  
    SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss"); // Añade la hora
    
    public data (){
}
    String user="",pass="",cliente="",nprodut=""; 
    Integer can;
    double val_produt, val_total=0;
    int m=0;
    
    // Almacena los datos del usuario que va a iniciar sesion 
     public void capture(){ 
     cadena.add(user= login.usuario.getText()); // almecena el nombre del usaurio en el arrayList (String) 
     cadena.add(pass= login.contra.getText()); //almacena la contraceña en el arrayList (String)
         JOptionPane.showMessageDialog(null, "Bienvenido "+ cadena.get(0)); // con cadena.get(0) optengo el primer dato  
                                                                            // que es el nombre de usario y asi lo puedo mandar a imprimir 
        
}
     
     public void clean (){   // Limpia los valores ya agregados  
     ventana.canP.setText("");  
     ventana.jTextField1.setText("");
     ventana.NomPro.setText("");
     ventana.valor.setText("");
     ventana.valortotal.setText("0");

     }
     // Captura  e Imprime ventas y numero de ventas
     public void vender (){
         can=Integer.parseInt(ventana.canP.getText());
         shell.add(val_produt=Double.parseDouble(ventana.valor.getText())); //En este almaceno el valor del producto 
                                                                          // con un ArrayLIst (Double)
         val_total=can*val_produt;
        String result = String.valueOf((val_total));
        ventana.valortotal.setText(result);
         
         double sumatoria=0;
         m++; // cada vez qeu use (vender) va incrementar el numeor de las ventas 1 en 1 
        for (Double shell1 : shell) {
            // Este arrgle hace la sumatoria de todas la ventas
            sumatoria=sumatoria+val_total;
        }
        
        String nv = String.valueOf(m);
        ventana.canven.setText(nv);
        String total = String.valueOf((sumatoria)); // Convientor el valor de la umatoria a string 
        ventana.totaltoto.setText(total);           // para poder imprimirlo en un label 
     } 
}
