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
public class Operacion4 {
     String[] Palabras;
     String texto;
     String reemplazo;
     int i =0;
     public void Llenando(JTextPane area1){
         reemplazo="";
         texto=area1.getText();
         Palabras= new String [10000];
         for (int cont=0; cont<texto.length();cont++ ){
             if (texto.charAt(cont) != ' ' && texto.charAt(cont) != '\n'){
                reemplazo = reemplazo + String.valueOf(texto.charAt(cont));
             } else
             {
              Palabras[i]=reemplazo;
                 System.out.println( Palabras[i]);
                 i++;
                 reemplazo="";
             }
     }
         Palabras[i]=reemplazo;
                 System.out.println( Palabras[i]);
                 i++;
                 reemplazo="";
         ordenando(area1);
     }
     public void ordenando (JTextPane area1){
    
     for (int j = 0; j < 100; j++){
      for (int i = 0; i < Palabras.length - 1; i++) {
                if (Palabras[i] != null && Palabras[i+1] != null){
                int compare = Palabras[i].compareTo(Palabras[i + 1]);
                    if (compare > 0) {
                    String nombre=Palabras[i];
                    Palabras[i]=Palabras[i+1];
                    Palabras[i+1]=nombre;
                }
                }
            }
     }
    area1.setText("");
         for (int i = 0; i < Palabras.length - 1; i++) {
                if (Palabras[i] != null){
                area1.setText(area1.getText()+Palabras[i]+"\n");
                    }else
                {
                i=10000000;
                }
                }
            }
     
     }
