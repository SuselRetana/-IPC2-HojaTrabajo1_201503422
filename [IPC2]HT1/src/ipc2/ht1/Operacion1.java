/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ipc2.ht1;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author freni_000
 */
public class Operacion1 {
    HT1 interfaz;
    String cadena;
    String[] subcadena;
    int i = 0;
    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
    public static boolean continuar = false; 
   
    public void Crear(JTextPane area1) throws FileNotFoundException, IOException {
          subcadena = new String[1000];
        JFileChooser file = new JFileChooser(); //crea la ventana para buscar el archivo que quiero
        file.showOpenDialog(file); //muestra la ventana.
        File ruta = file.getSelectedFile(); //lee que archivo selecciona el usuario y lo utiliza como la ruta.
        FileReader lecarchivo = new FileReader(ruta); //lee el archivo
        BufferedReader lecText = new BufferedReader(lecarchivo); // lee los caracteres del archivo
      
            while ((cadena = lecText.readLine()) != null) {
                subcadena[i] = cadena;
                i++;
            }
            lecText.close();
       Insertar (area1);

    }
    public void Insertar (JTextPane area1){
        area1.setText("");
            for (int t=0; t<1000;t++){
                if (subcadena[t] != null){
                         area1.setText(area1.getText()+subcadena[t]+"\n"); 
                   
                } else{
                    t=10000;
                 }
             }
}
   

}
