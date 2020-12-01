package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian Gato
 */
public class PruebasControl implements ActionListener {
    
 Vista.PrincipalJFrame principalVista;
 Modelo.Principal principalModelo;
 
 public PruebasControl(Vista.PrincipalJFrame principalVista){
 this.principalVista=principalVista;
 }
 
 
 @Override
 public void actionPerformed(ActionEvent e){
     
 if(e.getSource().equals(principalVista.Btn_calcular)){
 Integer Salario;
 String Horas=principalVista.txt_horas.getText();
 int Hor=Integer.parseInt(Horas);
 int Tar=0;
 int ext=Hor-40;
 int Tar2=(int) (Tar*1.25);
    if(principalVista.jrb_cat1.isSelected()){
        Tar=12000;
    }
    if(principalVista.jrb_cat2.isSelected()){
        Tar=17000;
    }
    if(principalVista.jrb_cat3.isSelected()){
        Tar=22000;
    }
    if(Hor<=40){
         Salario=Hor*Tar;
     }else{
         Salario=(40*Tar)+(ext*Tar2);       
     }
     JOptionPane.showMessageDialog(null, "El salario a pagar es de: "+Salario);
 }
  if(e.getSource().equals(principalVista.Btn_Salir)){
      System.exit(0);
  }
 }
}
