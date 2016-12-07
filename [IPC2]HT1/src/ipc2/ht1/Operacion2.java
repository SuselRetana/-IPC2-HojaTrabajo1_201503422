/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc2.ht1;
import java.awt.*;
import java.util.logging.*;
import java.util.regex.*;
import javax.swing.*;
import javax.swing.text.*;

/**
 *
 * @author freni_000
 */
public class Operacion2 {
    
    public void buscarpalabra (JTextPane area1, String texto){
    if (texto.length()>=1){
    DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.ORANGE);
    Highlighter h = area1.getHighlighter();
    h.removeAllHighlights();
    String text = area1.getText();
    String caracteres = texto;
    Pattern p = Pattern.compile("(?i)" + caracteres);
    Matcher m = p.matcher(text);
    
    while(m.find()){
    try{
    h.addHighlight(m.start(), m.end(), highlightPainter);
    
    }   catch (BadLocationException ex) {
            Logger.getLogger(Operacion2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    } else {
    JOptionPane.showMessageDialog(area1,"La palabra a buscar no puede ser vacia");
    }
    }
}
