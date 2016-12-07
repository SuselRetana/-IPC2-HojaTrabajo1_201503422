/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc2.ht1;

import javax.swing.*;
/**
 *
 * @author freni_000
 */
public class Operacion3 {
   public void reemplazando (JTextPane area1, String reemplazar, String nueva){
        if(reemplazar.length() >= 1 && nueva.length()>=1) {
            area1.setText(area1.getText().replace(reemplazar,nueva + "_201503422"));
        }else{
            JOptionPane.showMessageDialog(area1,"Asegurese de haber llenado ambos campos");
        }
   
   }
}
