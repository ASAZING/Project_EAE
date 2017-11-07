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
    ArrayList<Double> shell=new ArrayList(); // Alamcena Nuemors Reales
    ArrayList<Double> total=new ArrayList(); // Alamcena Nuemors Float
    ArrayList<data> operaciones;
    Date now = new Date(System.currentTimeMillis()); // Añade calendario con hora y fecha
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd"); // Añade fecha  
    SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss"); // Añade la hora
    
    public data (){
}
    String user="",pass="",cliente="",nprodut=""; 
    double can;
    double val_produt, val_total=0;
    int m=0;
    
    // Almacena los datos del usuario que va a iniciar sesion 
     public void capture(){ 
     cadena.add(login.usuario.getText()); // almecena el nombre del usaurio en el arrayList (String) 
     cadena.add(login.contra.getText()); //almacena la contraceña en el arrayList (String)
         JOptionPane.showMessageDialog(null, "Bienvenido "+ cadena.get(0)); // con cadena.get(0) optengo el primer dato  
     ventana.user.setText(cadena.get(0));

     }
     public void clean (){   // Limpia los valores ya agregados  
     ventana.canP.setText("");  
     ventana.cliente.setText("");
     ventana.NomPro.setText("");
     ventana.valor.setText("");
     ventana.valortotal.setText("0");

     }
     // Captura  e Imprime ventas y numero de ventas
     public void vender (){
         cadena.add(ventana.cliente.getText());
         can = Double.parseDouble(ventana.canP.getText());
         shell.add(val_produt=Double.parseDouble(ventana.valor.getText())); //En este almaceno el valor del producto 
                                                                 // con un ArrayLIst (Double)
         total.add(val_produt*can);
         String result = String.valueOf(val_produt*can);
        ventana.valortotal.setText(result);
         
         float sumatoria=0;
         m++; // cada vez qeu use (vender) va incrementar el numeor de las ventas 1 en 1 
         for (int i = 0; i < total.size(); i++) {
            // Este arrgle hace la sumatoria de todas la ventas
            sumatoria=(float) (sumatoria+total.get(i));
        }
        
        String nv = String.valueOf(m);
        ventana.canven.setText(nv);
        String total = String.valueOf((sumatoria)); // Convientor el valor de la Sumatoria a String 
        ventana.totaltoto.setText(total);           // para poder imprimirlo en un Jlabel 
     } 
     
     public void registrar () {
         
           cadena.add(JOptionPane.showInputDialog("Ingrese su Nombre")); // cadena.get(0)
           cadena.add(String.valueOf((String)JOptionPane.showInputDialog("Ingrese Numero de CC")));// cadena.get(1)
           cadena.add(String.valueOf((String)JOptionPane.showInputDialog("Ingrese N.telefonico")));// cadena.get(2)
           
           ventana.cliente.setText(cadena.get(1));
           // Estos datos se envian a el servidor donde seguardan los datos de los cliente 
         }
  
       
}

