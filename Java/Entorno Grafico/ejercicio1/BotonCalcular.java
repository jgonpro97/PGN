package ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotonCalcular implements ActionListener {
  private JTextField cuadroTexto;
  private JTextField cuadroTexto2;
  private JTextField cuadroTexto3;
  private JTextField cuadroTexto4;
  
  public BotonCalcular(JTextField cuadroTexto, JTextField cuadroTexto2, JTextField cuadroTexto3, JTextField cuadroTexto4) {
    this.cuadroTexto = cuadroTexto;
    this.cuadroTexto2 = cuadroTexto2;
    this.cuadroTexto3 = cuadroTexto3;
    this.cuadroTexto4 = cuadroTexto4;
  }

  public void actionPerformed(ActionEvent e) {
    int base = Integer.parseInt(cuadroTexto.getText());
    int altura = Integer.parseInt(cuadroTexto2.getText());
    int perimetro = (2 * base) + (2 * altura);
    int area = base * altura;
    
    cuadroTexto3.setText(Integer.toString(perimetro));
    cuadroTexto4.setText(Integer.toString(area));
//    JOptionPane.showMessageDialog(null, "El perimetro del circulo es " +
//    perimetro + " y el area es " + area);
  }
 }