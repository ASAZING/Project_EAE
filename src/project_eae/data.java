/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_eae;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author malcolmx
 */
public class data {
    ArrayList<String> cadena=new ArrayList(); // Alamcena datos en cadena
    ArrayList<Float> total=new ArrayList(); // Alamcena Nuemors Flotantes
    
    public data (){
}
    int can =0,m=0;;
    String user="",pass="",val_pro;
    float todo=0;

    // Almacena los datos del usuario que va a iniciar sesion 
     
     public void clean (){   // Limpia los valores ya agregados  
     ventana.canP.setText("");  
     ventana.cliente.setText("");
     ventana.valor.setText("0");
     ventana.valortotal.setText("0");

     }
     // Captura  e Imprime ventas y numero de ventas
     public void vender (){         
        ventana.Pro.getSelectedItem().toString();
         total.add(todo=Float.valueOf(ventana.valortotal.getText()));         
         float sumatoria=0;
         m++; // cada vez qeu use (vender) va incrementar el numeor de las ventas 1 en 1 
         for (int i = 0; i < total.size(); i++) {
            // Este arrgle hace la sumatoria de todas la ventas
            sumatoria=(float) (sumatoria+total.get(i));
        }
        
        String nv = String.valueOf(m);
        ventana.canven.setText(nv);
        String totatod = String.valueOf((sumatoria)); // Convientor el valor de la Sumatoria a String 
        ventana.totaltoto.setText(totatod);           // para poder imprimirlo en un Jlabel                 
     }
     public void registrar () {
         
           cadena.add(JOptionPane.showInputDialog("Ingrese su Nombre")); // cadena.get(0)
           cadena.add(String.valueOf((String)JOptionPane.showInputDialog("Ingrese Numero de CC")));// cadena.get(1)
           cadena.add(String.valueOf((String)JOptionPane.showInputDialog("Ingrese N.telefonico")));// cadena.get(2)
           
           ventana.cliente.setText(cadena.get(1));
           // Estos datos se envian a el servidor donde seguardan los datos de los cliente 
         }
     public void produc (){
         ventana.Pro.getSelectedItem().toString();
         switch (ventana.Pro.getSelectedItem().toString()) {
             case "Monitor":
                 val_pro= String.valueOf("100000");
                 break;
             case "i3":
                 val_pro= String.valueOf("500000");
                 break;
             case "i5":
                 val_pro= String.valueOf("800000");
             case "i7":
                 val_pro= String.valueOf("1000000");
                 break;
             case "Mother board":
                 val_pro= String.valueOf("700000");
                 break;
             case "Parlantes":
                 val_pro= String.valueOf("500000");
                 break;
             case "Mouse":
                 val_pro= String.valueOf("200000");
                 break;
             case "Teclado":
                 val_pro= String.valueOf("300000");
                 break;    
               
         }
         setValp(val_pro);
         
     }
     
     private void setValp(String val_pro){
     ventana.valor.setText(val_pro);
     
     }

}
