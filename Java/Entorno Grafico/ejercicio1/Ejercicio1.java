package ejercicio1;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio1 extends JFrame {
  
  public Ejercicio1() {
    super("Calculo de perimetro y area");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Container cp = getContentPane();
    cp.add(new JLabel("Base:"));
    JTextField base = new JTextField(4);
    cp.add(base);
    cp.add(new JLabel("Altura:"));
    JTextField altura = new JTextField(4);
    cp.add(altura);
    cp.add(new JLabel("Perimetro:"));
    JTextField perimetro = new JTextField(4);
    cp.add(perimetro);
    cp.add(new JLabel("Area:"));
    JTextField area = new JTextField(4);
    cp.add(area);
    JButton BotonCalcular = new JButton("Calcular");
    cp.add(BotonCalcular);
    BotonCalcular.addActionListener(new BotonCalcular(base, altura, perimetro, area));
    }

}
