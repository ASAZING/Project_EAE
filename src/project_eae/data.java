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
    ArrayList<String> cadena=new ArrayList(); //Almacena datos en cadena (String)
    ArrayList<Float> total=new ArrayList(); // Alamcena Nuemors Flotantes
    
    public data (){
}
    int can;
    String user="",pass="";
    float val_produt=0;
    int m=0;
    // Almacena los datos del usuario que va a iniciar sesion 
     public void capture(){ 
     cadena.add(user =login.usuario.getText()); // almecena el nombre del usaurio en el arrayList (String) 
     cadena.add(pass=login.contra.getText()); //almacena la contraceña en el arrayList (String)
         
         if (pass.equals("holis123") && user.equals("malcolm")) {
             ventana.user.setText(cadena.get(0));
             JOptionPane.showMessageDialog(null, "Bienvenido "+ cadena.get(0)); // con cadena.get(0) optengo el primer dato 
         } else {
             login log=new login();
             log.setVisible(true);
             log.setTitle("Inicio de Sesion");
             log.setLocationRelativeTo(null);
             JOptionPane.showMessageDialog(null, "Error de Usuario"); // error de usario 
         }
     

     }
     public void clean (){   // Limpia los valores ya agregados  
     ventana.canP.setText("");  
     ventana.cliente.setText("");
     ventana.valor.setText("0");
     ventana.valortotal.setText("0");

     }
     // Captura  e Imprime ventas y numero de ventas
     public void vender (){
         cadena.add(ventana.cliente.getText());
         can = Integer.parseInt(ventana.canP.getText());
         if (ventana.Pro.getSelectedItem().equals("Monitor")) {
            val_produt=100000;
        }else{
             if (ventana.Pro.getSelectedItem().equals("i3")) {
              val_produt=500000;
             }else{
                 if (ventana.Pro.getSelectedItem().equals("i5")) {
                  val_produt=800000;
             }else{
                     if (ventana.Pro.getSelectedItem().equals("i7")) {
                      val_produt=1000000;
                     } else {
                         if (ventana.Pro.getSelectedItem().equals("i7")) {
                          val_produt=1000000;
                   }else{
                       if (ventana.Pro.getSelectedItem().equals("Mother board")) {
                        val_produt=700000;
                       } else {
                           if (ventana.Pro.getSelectedItem().equals("Mouse")) {
                            val_produt=200000;
                           } else {
                               if (ventana.Pro.getSelectedItem().equals("Teclado")) {
                                val_produt=300000;
                               } else {
                                   if (ventana.Pro.getSelectedItem().equals("Parlantes")) {
                                    val_produt=500000;
                                       
                                   } else {
                                       JOptionPane.showMessageDialog(null, "Porfavor selecione un producto");
                                       
                                   }
         }
        } 
       } 
      } 
     }
    } 
   } 
  }                     
                                    
         total.add(val_produt*can);
         String result = String.valueOf(val_produt*can);
        ventana.valortotal.setText(result);
        
         
         float sumatoria=0;
         m++; // cada vez qeu use (vender) va incrementar el numeor de las ventas 1 en 1 
         for (int i = 0; i < total.size(); i++) {
            // Este arrglo hace la sumatoria de todas la ventas
            sumatoria= sumatoria+total.get(i);
        }
        
        String nv = String.valueOf(m);
        ventana.canven.setText(nv);
        String totalS = String.valueOf((sumatoria)); // Convientor el valor de la Sumatoria a String 
        ventana.totaltoto.setText(totalS);           // para poder imprimirlo en un Jlabel 

     }
     public void registrar () {
         
           cadena.add(JOptionPane.showInputDialog("Ingrese su Nombre")); // cadena.get(0)
           cadena.add(String.valueOf((String)JOptionPane.showInputDialog("Ingrese Numero de CC")));// cadena.get(1)
           cadena.add(String.valueOf((String)JOptionPane.showInputDialog("Ingrese N.telefonico")));// cadena.get(2)
           
           ventana.cliente.setText(cadena.get(1));
           // Estos datos se envian a el servidor donde seguardan los datos de los cliente 
         }
     public void produc (){
         String nomp="";
         nomp=ventana.Pro.getSelectedItem().toString();
         if (ventana.Pro.getSelectedItem().equals("Monitor")) {
             String val_pro= String.valueOf("100000");
             ventana.valor.setText(val_pro);
             
         } else {
             if (ventana.Pro.getSelectedItem().equals("i3")) {
                 String val_pro= String.valueOf("500000");
                 ventana.valor.setText(val_pro);
                 
             } else {
                 if (ventana.Pro.getSelectedItem().equals("i5")) {
                 String val_pro= String.valueOf("800000");
                 ventana.valor.setText(val_pro);
                     
                 } else {
                   if (ventana.Pro.getSelectedItem().equals("i7")) {
                   String val_pro= String.valueOf("1000000");
                   ventana.valor.setText(val_pro);
                   }else{
                       if (ventana.Pro.getSelectedItem().equals("Mother board")) {
                       String val_pro= String.valueOf("700000");
                       ventana.valor.setText(val_pro);
                           
                       } else {
                           if (ventana.Pro.getSelectedItem().equals("Mouse")) {
                           String val_pro= String.valueOf("200000");
                           ventana.valor.setText(val_pro);
                           } else {
                               if (ventana.Pro.getSelectedItem().equals("Teclado")) {
                               String val_pro= String.valueOf("300000");
                               ventana.valor.setText(val_pro);
                               } else {
                                   if (ventana.Pro.getSelectedItem().equals("Parlantes")) {
                                   String val_pro= String.valueOf("500000");
                                   ventana.valor.setText(val_pro);
                                       
                                   } else {
                                       JOptionPane.showMessageDialog(null, "Porfavor selecione un producto");
                                   }
                               }
                           }
                       }
                       
                   }
                 }
                 
             }
         }
     
     }

}
