package ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame {

  private JPanel contentPane;
  private JTextField textField;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ejercicio3 frame = new Ejercicio3();
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
  public Ejercicio3() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel txDni = new JLabel("DNI:");
    txDni.setBounds(58, 52, 45, 13);
    contentPane.add(txDni);
    
    textField = new JTextField();
    textField.setBounds(275, 49, 96, 19);
    contentPane.add(textField);
    textField.setColumns(10);
    
    JButton btValidar = new JButton("Validar");
    btValidar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        try {
          String [] letraDni = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
          String dni = textField.getText();
          String numerosDni = dni.substring(0, 8);
          String letra = dni.toUpperCase().substring(8);
          int numDni = Integer.parseInt(numerosDni);
          int resto = numDni % 23;
          
          if (letra.equals(letraDni[resto])) {
            JOptionPane.showMessageDialog(null, "Dni valido");
          }
          
          else {
            JOptionPane.showMessageDialog(null, "Dni no valido", "Error" , JOptionPane.ERROR_MESSAGE);
          }
          
        } catch (Exception e1) {
          JOptionPane.showMessageDialog(null, "Dni no valido", "Error" , JOptionPane.ERROR_MESSAGE);
        }
               
      }
    });
    
    btValidar.setBounds(286, 149, 85, 21);
    contentPane.add(btValidar);
    
  }
 
}
