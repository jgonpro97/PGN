package ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotonCalcular implements ActionListener {
  private JTextField texto;
  private JTextField texto2;
  private JTextField texto3;
  private JTextField texto4;
  private JTextField texto5;

  public BotonCalcular(JTextField texto, JTextField texto2, JTextField texto3, JTextField texto4, JTextField texto5) {
    this.texto = texto;
    this.texto2 = texto2;
    this.texto3 = texto3;
    this.texto4 = texto4;
    this.texto5 = texto5;
  }

  public void actionPerformed(ActionEvent e) {
    int x1 = Integer.parseInt(texto.getText());
    int y1 = Integer.parseInt(texto2.getText());
    int x2 = Integer.parseInt(texto3.getText());
    int y2 = Integer.parseInt(texto4.getText());
    
    int distancia = distancia = (int)Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    
    texto5.setText(Integer.toString(distancia));
    
  }
 }