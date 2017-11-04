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
    ArrayList<String> cadema=new ArrayList();
    Date now = new Date(System.currentTimeMillis());
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss"); 
    
    public data (){
}
    String user="";
    String pass="";
    
     public void capture(){
     cadema.add(user= login.usuario.getText());
     cadema.add(pass= login.contra.getText());
         JOptionPane.showMessageDialog(null, "Bienvenido "+ cadema.get(0));
         
}
     public void captureImp (){
     
     
System.out.println(date.format(now)+" "+hour.format(now));

System.out.println(now);
     }
}
