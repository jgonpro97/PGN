package ejercicio4;

/**
 * 4. Cajero de cambio: devuelve y desglosa el cambio en billetes y monedas de forma "ideal"; es decir, con el menor número de billetes y monedas posibles.
 *
 * Componentes gráficos: 
 *
 * Etiquetas.
 * Caja de texto para introducir dinero a cambiar.
 * Cajas de texto para billetes y monedas.
 * Botón para calcular.
 * Opcional: sustituir la etiqueta de cada billete y moneda por su imagen. 
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;

public class Ejercicio4 extends JFrame {

  private JPanel contentPane;
  private JLabel etCantidad;
  private JTextField ctCantidad;
  private JLabel et500e;
  private JTextField ct500e;
  private JLabel et200e;
  private JTextField ct200e;
  private JLabel et100e;
  private JTextField ct100e;
  private JLabel et50e;
  private JTextField ct50e;
  private JLabel et20e;
  private JTextField ct20e;
  private JLabel et10e;
  private JTextField ct10e;
  private JLabel et5e;
  private JTextField ct5e;
  private JLabel et2e;
  private JTextField ct2e;
  private JLabel et1e;
  private JTextField ct1e;
  private JLabel et50c;
  private JTextField ct50c;
  private JLabel et20c;
  private JTextField ct20c;
  private JLabel et10c;
  private JTextField ct10c;
  private JLabel et5c;
  private JTextField ct5c;
  private JLabel et2c;
  private JTextField ct2c;
  private JLabel et1c;
  private JTextField ct1c;



  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ejercicio4 frame = new Ejercicio4();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public Ejercicio4() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    etCantidad = new JLabel("Cantidad:");
    etCantidad.setBounds(25, 30, 81, 13);
    contentPane.add(etCantidad);
    
    ctCantidad = new JTextField();
    ctCantidad.setBounds(112, 27, 170, 19);
    contentPane.add(ctCantidad);
    ctCantidad.setColumns(10);
    
    et500e = new JLabel("500€");
    et500e.setBounds(39, 70, 50, 13);
    contentPane.add(et500e);
    
    ct500e = new JTextField();
    ct500e.setBounds(25, 95, 50, 20);
    contentPane.add(ct500e);
    ct500e.setColumns(10);
    
    et200e = new JLabel("200€");
    et200e.setBounds(124, 70, 50, 13);
    contentPane.add(et200e);
    
    ct200e = new JTextField();
    ct200e.setColumns(10);
    ct200e.setBounds(110, 95, 50, 20);
    contentPane.add(ct200e);
    
    et100e = new JLabel("100€");
    et100e.setBounds(209, 70, 50, 13);
    contentPane.add(et100e);
    
    ct100e = new JTextField();
    ct100e.setColumns(10);
    ct100e.setBounds(195, 95, 50, 20);
    contentPane.add(ct100e);
     
    et50e = new JLabel("50€");
    et50e.setBounds(294, 70, 50, 13);
    contentPane.add(et50e);
    
    ct50e = new JTextField();
    ct50e.setColumns(10);
    ct50e.setBounds(280, 95, 50, 20);
    contentPane.add(ct50e);
    
    et20e = new JLabel("20€");
    et20e.setBounds(376, 70, 50, 13);
    contentPane.add(et20e);
    
    ct20e = new JTextField();
    ct20e.setColumns(10);
    ct20e.setBounds(360, 95, 50, 20);
    contentPane.add(ct20e);
    
    et10e = new JLabel("10€");
    et10e.setBounds(39, 130, 50, 13);
    contentPane.add(et10e);
    
    ct10e = new JTextField();
    ct10e.setColumns(10);
    ct10e.setBounds(25, 155, 50, 20);
    contentPane.add(ct10e);
    
    et5e = new JLabel("5€");
    et5e.setBounds(124, 130, 50, 13);
    contentPane.add(et5e);
    
    ct5e = new JTextField();
    ct5e.setColumns(10);
    ct5e.setBounds(110, 155, 50, 20);
    contentPane.add(ct5e);

    et2e = new JLabel("2€");
    et2e.setBounds(209, 130, 50, 13);
    contentPane.add(et2e);
    
    ct2e = new JTextField();
    ct2e.setColumns(10);
    ct2e.setBounds(195, 155, 50, 20);
    contentPane.add(ct2e);
    
    et1e = new JLabel("1€");
    et1e.setBounds(294, 130, 50, 13);
    contentPane.add(et1e);
    
    ct1e = new JTextField();
    ct1e.setColumns(10);
    ct1e.setBounds(280, 155, 50, 20);
    contentPane.add(ct1e);
    
    et50c = new JLabel("0.5€");
    et50c.setBounds(376, 130, 50, 13);
    contentPane.add(et50c);
    
    ct50c = new JTextField();
    ct50c.setColumns(10);
    ct50c.setBounds(360, 155, 50, 20);
    contentPane.add(ct50c);
    
    et20c = new JLabel("0.2€");
    et20c.setBounds(39, 190, 50, 13);
    contentPane.add(et20c);
    
    ct20c = new JTextField();
    ct20c.setColumns(10);
    ct20c.setBounds(25, 215, 50, 20);
    contentPane.add(ct20c);
    
    et10c = new JLabel("0.1€");
    et10c.setBounds(124, 190, 50, 13);
    contentPane.add(et10c);
    
    ct10c = new JTextField();
    ct10c.setColumns(10);
    ct10c.setBounds(110, 215, 50, 20);
    contentPane.add(ct10c);
    
    et5c = new JLabel("0.05€");
    et5c.setBounds(209, 190, 50, 13);
    contentPane.add(et5c);
    
    ct5c = new JTextField();
    ct5c.setColumns(10);
    ct5c.setBounds(195, 215, 50, 20);
    contentPane.add(ct5c);
    
    et2c = new JLabel("0.02€");
    et2c.setBounds(294, 190, 50, 13);
    contentPane.add(et2c);
    
    ct2c = new JTextField();
    ct2c.setColumns(10);
    ct2c.setBounds(280, 215, 50, 20);
    contentPane.add(ct2c);
    
    et1c = new JLabel("0.01€");
    et1c.setBounds(376, 190, 50, 13);
    contentPane.add(et1c);
    
    ct1c = new JTextField();
    ct1c.setColumns(10);
    ct1c.setBounds(360, 215, 50, 20);
    contentPane.add(ct1c);
    
    JButton btCambio = new JButton("Cambio");
    btCambio.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        
        try {
          
          double numero = Double.parseDouble(ctCantidad.getText());
          String cadena = String.valueOf(numero);
          
          int pEntera = Integer.parseInt(cadena.substring(0, cadena.indexOf('.')));
          double decimal = Double.parseDouble(cadena.substring(cadena.indexOf('.')));
          int pDecimal = (int) (decimal * 100);
          
          int [] euros = {500, 200, 100, 50, 20, 10, 5, 2, 1};
          int [] numEuros = {0, 0, 0, 0, 0, 0, 0, 0, 0};
          
          int [] centimos = {50, 20, 10, 5, 2, 1};
          int [] numCentimos = {0, 0, 0, 0, 0, 0};
          
          for (int i = 0; i < euros.length; i++) {
            numEuros[i] = pEntera / euros[i];
            pEntera -= (euros[i] * numEuros[i]);
            
          }
          
          for (int i = 0; i < centimos.length; i++) {            
            numCentimos[i] = pDecimal / centimos[i]; 
            pDecimal -= (centimos[i] * numCentimos[i]);
          }
          
          ct500e.setText(Integer.toString(numEuros[0]));
          ct200e.setText(Integer.toString(numEuros[1]));
          ct100e.setText(Integer.toString(numEuros[2]));
          ct50e.setText(Integer.toString(numEuros[3]));
          ct20e.setText(Integer.toString(numEuros[4]));
          ct10e.setText(Integer.toString(numEuros[5]));
          ct5e.setText(Integer.toString(numEuros[6]));
          ct2e.setText(Integer.toString(numEuros[7]));
          ct1e.setText(Integer.toString(numEuros[8]));
          ct50c.setText(Integer.toString(numCentimos[0]));
          ct20c.setText(Integer.toString(numCentimos[1]));
          ct10c.setText(Integer.toString(numCentimos[2]));
          ct5c.setText(Integer.toString(numCentimos[3]));
          ct2c.setText(Integer.toString(numCentimos[4]));
          ct1c.setText(Integer.toString(numCentimos[5]));
          
        } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(null, "Dato introducido no numerico", "Error" , JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Formato de numero no valido (2 decimales)", "Error" , JOptionPane.ERROR_MESSAGE);
        }
        
        
      }
    });
    
    btCambio.setBounds(325, 26, 85, 21);
    contentPane.add(btCambio);
    
  }
}
