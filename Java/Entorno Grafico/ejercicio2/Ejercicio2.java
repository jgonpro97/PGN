package ejercicio2;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio2 extends JFrame {
  
  public Ejercicio2() {
    super("Calculo distancia entre dos puntos");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Container cp = getContentPane();
    cp.add(new JLabel("x1 :"));
    JTextField x1 = new JTextField(5);
    cp.add(x1);
    cp.add(new JLabel("y1 :"));
    JTextField y1 = new JTextField(5);
    cp.add(y1);
    cp.add(new JLabel("x2 :"));
    JTextField x2 = new JTextField(5);
    cp.add(x2);
    cp.add(new JLabel("y2 :"));
    JTextField y2 = new JTextField(5);
    cp.add(y2);
    cp.add(new JLabel("Distancia :"));
    JTextField distancia = new JTextField(5);
    cp.add(distancia);
    JButton BotonCalcular = new JButton("Calcular");
    cp.add(BotonCalcular);
    BotonCalcular.addActionListener(new BotonCalcular(x1, y1, x2, y2, distancia));
    }

}
